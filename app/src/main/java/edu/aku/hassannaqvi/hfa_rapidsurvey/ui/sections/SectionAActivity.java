package edu.aku.hassannaqvi.hfa_rapidsurvey.ui.sections;

import static edu.aku.hassannaqvi.hfa_rapidsurvey.core.MainApp.form;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Clear;
import com.validatorcrawler.aliazaz.Validator;

import org.json.JSONException;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import edu.aku.hassannaqvi.hfa_rapidsurvey.R;
import edu.aku.hassannaqvi.hfa_rapidsurvey.contracts.DistrictContract;
import edu.aku.hassannaqvi.hfa_rapidsurvey.contracts.HFContract;
import edu.aku.hassannaqvi.hfa_rapidsurvey.contracts.Tables.FormsTable;
import edu.aku.hassannaqvi.hfa_rapidsurvey.contracts.TehsilsContract;
import edu.aku.hassannaqvi.hfa_rapidsurvey.contracts.UCsContract;
import edu.aku.hassannaqvi.hfa_rapidsurvey.core.DatabaseHelper;
import edu.aku.hassannaqvi.hfa_rapidsurvey.core.MainApp;
import edu.aku.hassannaqvi.hfa_rapidsurvey.databinding.ActivitySectionABinding;
import edu.aku.hassannaqvi.hfa_rapidsurvey.models.Forms;
import edu.aku.hassannaqvi.hfa_rapidsurvey.ui.other.SectionMainActivity;

public class SectionAActivity extends AppCompatActivity {

    private final boolean fcFlag = false;
    ActivitySectionABinding bi;
    private List<String> districtNames, tehsilNames, ucNames;
    private List<String> districtCodes, tehsilCodes, ucCodes;
    private List<String> districtTypes;
    private DatabaseHelper db;
    private List<String> hfNamesPrv, hfNamesPub;
    private Map<String, String> hfMap;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_a);
        bi.setCallback(this);
        //bi.setFormsContract(MainApp.fc);
        initializingComponents();
        initializeHF();
    }


    private void initializingComponents() {
        // Databinding Edit Mode (only in first activity for every contract)
        form = new Forms();
        db = MainApp.appInfo.getDbHelper();
        populateSpinner(this);
    }


    private void initializeHF() {
        //For HF
        hfNamesPrv = new ArrayList<String>() {
            {
                add("....");
            }
        };
        hfNamesPub = new ArrayList<String>() {
            {
                add("....");
            }
        };
        hfMap = new HashMap<>();
    }


    public void populateSpinner(final Context context) {
        // Spinner Drop down elements
        districtNames = new ArrayList<>();
        districtCodes = new ArrayList<>();
        districtTypes = new ArrayList<>();

        districtNames.add("....");
        districtCodes.add("....");
        districtTypes.add("....");

        Collection<DistrictContract> dc = db.getAllDistricts();

        for (DistrictContract d : dc) {
            districtNames.add(d.getDistrictName());
            districtCodes.add(d.getDistrictCode());
            districtTypes.add(d.getDistrictType());
        }

        bi.districtName.setAdapter(new ArrayAdapter<>(context, android.R.layout.simple_spinner_dropdown_item, districtNames));

        bi.districtName.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                if (position == 0) return;

                tehsilNames = new ArrayList<>();
                tehsilCodes = new ArrayList<>();

                tehsilNames.add("....");
                tehsilCodes.add("....");

                Collection<TehsilsContract> pc = db.getAllTehsils(districtCodes.get(position));
                for (TehsilsContract p : pc) {
                    tehsilNames.add(p.getTehsilName());
                    tehsilCodes.add(p.getTehsilCode());
                }

                bi.tehsilName.setAdapter(new ArrayAdapter<>(context, android.R.layout.simple_spinner_dropdown_item, tehsilNames));

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {


            }
        });

        bi.tehsilName.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                if (position == 0) return;

                ucNames = new ArrayList<>();
                ucCodes = new ArrayList<>();

                ucNames.add("....");
                ucCodes.add("....");
                Clear.clearAllFields(bi.fldGrpCVa110);

                //For HF
                initializeHF();

                Collection<UCsContract> pc = db.getAllUCs(tehsilCodes.get(bi.tehsilName.getSelectedItemPosition()));
                for (UCsContract p : pc) {
                    ucCodes.add(p.getUc_code());
                    ucNames.add(p.getUc_name());
                }

                bi.ucName.setAdapter(new ArrayAdapter<>(context, android.R.layout.simple_spinner_dropdown_item, ucNames));
                bi.hfName.setAdapter(new ArrayAdapter<>(context, android.R.layout.simple_spinner_dropdown_item, Collections.emptyList()));
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        bi.ucName.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                Clear.clearAllFields(bi.fldGrpCVa110);

                if (position == 0) return;
                if (hfMap.size() > 0) return;
                Collection<HFContract> pc = db.getAllHFs(tehsilCodes.get(bi.tehsilName.getSelectedItemPosition()));
                for (HFContract p : pc) {
                    if (p.getHf_type().equals("1")) hfNamesPub.add(p.getHf_name());
                    else hfNamesPrv.add(p.getHf_name());
                    hfMap.put(p.getHf_name(), p.getHf_code());
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        bi.a110.setOnCheckedChangeListener(((radioGroup, i) -> {
            Clear.clearAllFields(bi.fldGrpCVa111);
            if (i == bi.a110a.getId()) {
                bi.hfName.setAdapter(new ArrayAdapter<>(context, android.R.layout.simple_spinner_dropdown_item, hfNamesPub));
            } else if (i == bi.a110b.getId()) {
                bi.hfName.setAdapter(new ArrayAdapter<>(context, android.R.layout.simple_spinner_dropdown_item, hfNamesPrv));
            }
        }));

        bi.hfName.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                //                Toast.makeText(SectionAActivity.this, String.valueOf(hfCodes.get(bi.a13.getSelectedItemPosition())), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }


    public void btnContinue(View v) {
        if (!formValidation()) return;
        SaveDraft();
        if (UpdateDB()) {
            finish();
            startActivity(new Intent(this, SectionMainActivity.class));
        } else {
            Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
        }
    }


    private boolean UpdateDB() {

        if (!form.getId().equals("")) return true;

        long updcount = 0;
        try {
            updcount = db.addForms(form);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        form.setId(String.valueOf(updcount));
        if (updcount > 0) {
            form.setUid(form.getDeviceID() + form.getId());
            db.updatesFormsColumn(FormsTable.COLUMN_UID, form.getUid());
            return true;
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
            return false;
        }

    }


    private void SaveDraft() {

        if (!form.getId().equals("")) return;

        form = new Forms();

        form.setSysdate(new SimpleDateFormat("dd-MM-yy HH:mm").format(new Date().getTime()));
        form.setUserName(MainApp.userName);
        form.setDeviceID(MainApp.appInfo.getDeviceID());
        form.setDevicetagID(MainApp.appInfo.getTagName());
        form.setAppversion(MainApp.appInfo.getAppVersion());
        form.setA103d(bi.a103d.getText().toString().trim().isEmpty() ? "-1" : bi.a103d.getText().toString());
        form.setA103m(bi.a103m.getText().toString().trim().isEmpty() ? "-1" : bi.a103m.getText().toString());
        form.setA103y(bi.a103y.getText().toString().trim().isEmpty() ? "-1" : bi.a103y.getText().toString());

        form.setDistrictCode(districtCodes.get(bi.districtName.getSelectedItemPosition()));
        form.setDistrictName(bi.districtName.getSelectedItem().toString());
        form.setDistrictType(districtTypes.get(bi.districtName.getSelectedItemPosition()));

        form.setTehsilCode(tehsilCodes.get(bi.tehsilName.getSelectedItemPosition()));
        form.setTehsilName(bi.tehsilName.getSelectedItem().toString());

        form.setUcCode(ucCodes.get(bi.ucName.getSelectedItemPosition()));
        form.setUcName(bi.ucName.getSelectedItem().toString());

        form.setHfCode(hfMap.get(bi.hfName.getSelectedItem().toString()));
        form.setHfName(bi.hfName.getSelectedItem().toString());

        form.setA110(bi.a110a.isChecked() ? "1"
                : bi.a110b.isChecked() ? "2"
                : "-1");

        form.setA111(bi.a111a.isChecked() ? "1"
                : bi.a111b.isChecked() ? "2"
                : "-1");

        //MainApp.setGPS(this); // Set GPS
    }


    private boolean formValidation() {
        if (!Validator.emptyCheckingContainer(this, bi.GrpName)) {
            return false;
        }

        if (db.CheckHF(String.valueOf(hfMap.get(bi.hfName.getSelectedItem().toString())))) {
            Toast.makeText(this, "Facility Already filled ", Toast.LENGTH_LONG).show();
            return false;
        }

        form = db.CheckHF(String.valueOf(hfMap.get(bi.hfName.getSelectedItem().toString())), "1");
        if (form == null) {
            Toast.makeText(this, "Partially filled Facility ", Toast.LENGTH_LONG).show();
            return true;
        }
        return true;
    }


    public void btnEnd(View v) {
        //openSectionMainActivity(this, "A");
    }

}
