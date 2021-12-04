package edu.aku.hassannaqvi.hfa_rapidsurvey.ui.sections;

import static edu.aku.hassannaqvi.hfa_rapidsurvey.core.MainApp.fc;
import static edu.aku.hassannaqvi.hfa_rapidsurvey.utils.UtilKt.openSectionMainActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Clear;
import com.validatorcrawler.aliazaz.Validator;

import org.json.JSONException;
import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.Date;

import edu.aku.hassannaqvi.hfa_rapidsurvey.R;
import edu.aku.hassannaqvi.hfa_rapidsurvey.core.DatabaseHelper;
import edu.aku.hassannaqvi.hfa_rapidsurvey.core.MainApp;
import edu.aku.hassannaqvi.hfa_rapidsurvey.databinding.ActivitySectionG1Binding;

public class SectionG1Activity extends AppCompatActivity {

    ActivitySectionG1Binding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_g1);
        bi.setCallback(this);
        setupSkips();

    }


    private void setupSkips() {

        bi.g0111.setOnCheckedChangeListener(((radioGroup, i) -> {
            Clear.clearAllFields(bi.fldGrpCVg01112);
        }));

        bi.g01113.setOnCheckedChangeListener(((radioGroup, i) -> {
            Clear.clearAllFields(bi.fldGrpCVg01114);
        }));

        /*bi.g0108a.setOnCheckedChangeListener(((radioGroup, i) -> {

            if (i == bi.g0108aa.getId()) {
                Clear.clearAllFields(bi.fldGrpCVg0108b);
                Clear.clearAllFields(bi.fldGrpCVg0108c);
                bi.fldGrpCVg0108b.setVisibility(View.GONE);
                bi.fldGrpCVg0108c.setVisibility(View.GONE);
            } else if (i == bi.g0108ab.getId()) {
                Clear.clearAllFields(bi.fldGrpCVg0108b);
                Clear.clearAllFields(bi.fldGrpCVg0108c);
                bi.fldGrpCVg0108b.setVisibility(View.GONE);
                bi.fldGrpCVg0108c.setVisibility(View.GONE);
            }

        }));

        bi.g0108b.setOnCheckedChangeListener(((radioGroup, i) -> {

            if (i == bi.g0108ba.getId()) {
                Clear.clearAllFields(bi.fldGrpCVg0108a);
                Clear.clearAllFields(bi.fldGrpCVg0108c);
                bi.fldGrpCVg0108a.setVisibility(View.GONE);
                bi.fldGrpCVg0108c.setVisibility(View.GONE);
            } else if (i == bi.g0108bb.getId()) {
                Clear.clearAllFields(bi.fldGrpCVg0108a);
                Clear.clearAllFields(bi.fldGrpCVg0108c);
                bi.fldGrpCVg0108a.setVisibility(View.GONE);
                bi.fldGrpCVg0108c.setVisibility(View.GONE);
            }
        }));

        bi.g0108c.setOnCheckedChangeListener(((radioGroup, i) -> {

            if (i == bi.g0108ca.getId()) {
                Clear.clearAllFields(bi.fldGrpCVg0108a);
                Clear.clearAllFields(bi.fldGrpCVg0108b);
                bi.fldGrpCVg0108a.setVisibility(View.GONE);
                bi.fldGrpCVg0108b.setVisibility(View.GONE);
            } else if (i == bi.g0108cb.getId()) {
                Clear.clearAllFields(bi.fldGrpCVg0108a);
                Clear.clearAllFields(bi.fldGrpCVg0108b);
                bi.fldGrpCVg0108a.setVisibility(View.GONE);
                bi.fldGrpCVg0108b.setVisibility(View.GONE);
            }
        }));*/
    }


    private boolean UpdateDB() {
        DatabaseHelper db = MainApp.appInfo.getDbHelper();
        int updcount = db.updatesFormColumn(FormsContract.FormsTable.COLUMN_SG, fc.getsG());
        if (updcount == 1) {
            return true;
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
            return false;
        }
    }


    private void SaveDraft() throws JSONException {

        JSONObject json = new JSONObject();

        json.put("GDate", new SimpleDateFormat("dd-MM-yyyy").format(new Date().getTime()));
        json.put("GTime", new SimpleDateFormat("HH:mm").format(new Date().getTime()));

        json.put("g101", bi.g101a.isChecked() ? "1"
                : bi.g101b.isChecked() ? "2"
                : bi.g101c.isChecked() ? "3"
                : bi.g101d.isChecked() ? "4"
                : bi.g101e.isChecked() ? "5"
                : bi.g101f.isChecked() ? "6"
                : bi.g101x.isChecked() ? "96"
                : "-1");
        json.put("g101xx", bi.g101xx.getText().toString().trim().isEmpty() ? "-1" : bi.g101xx.getText().toString());


        json.put("g102", bi.g102a.isChecked() ? "1"
                : bi.g102b.isChecked() ? "2"
                : "-1");

        json.put("g103", bi.g103a.isChecked() ? "1"
                : bi.g103b.isChecked() ? "98"
                : bi.g103x.isChecked() ? "96"
                : "-1");
        json.put("g103xx", bi.g103xx.getText().toString().trim().isEmpty() ? "-1" : bi.g103xx.getText().toString());

        json.put("g104", bi.g104a.isChecked() ? "1"
                : bi.g104b.isChecked() ? "2"
                : bi.g104c.isChecked() ? "3"
                : bi.g104d.isChecked() ? "4"
                : bi.g104e.isChecked() ? "5"
                : bi.g104f.isChecked() ? "6"
                : bi.g104g.isChecked() ? "7"
                : "-1");

        json.put("g105ax", bi.g105ax.getText().toString().trim().isEmpty() ? "-1" : bi.g105ax.getText().toString());
        json.put("g105bx", bi.g105bx.getText().toString().trim().isEmpty() ? "-1" : bi.g105bx.getText().toString());

        json.put("g106", bi.g106a.isChecked() ? "1"
                : bi.g106b.isChecked() ? "2"
                : bi.g106c.isChecked() ? "3"
                : bi.g106d.isChecked() ? "4"
                : bi.g106x.isChecked() ? "96"
                : "-1");
        json.put("g106xx", bi.g106xx.getText().toString().trim().isEmpty() ? "-1" : bi.g106xx.getText().toString());

        json.put("g107", bi.g107a.isChecked() ? "1"
                : bi.g107b.isChecked() ? "2"
                : bi.g107c.isChecked() ? "3"
                : bi.g107x.isChecked() ? "96"
                : "-1");
        json.put("g107xx", bi.g107xx.getText().toString().trim().isEmpty() ? "-1" : bi.g107xx.getText().toString());


        /*json.put("g108a", bi.g108aa.isChecked() ? "1"
                : bi.g108ab.isChecked() ? "2"
                : "-1");

        json.put("g108b", bi.g108ba.isChecked() ? "1"
                : bi.g108bb.isChecked() ? "2"
                : "-1");

        json.put("g108c", bi.g108ca.isChecked() ? "1"
                : bi.g108cb.isChecked() ? "2"
                : "-1");*/


        json.put("g109", bi.g109a.isChecked() ? "1"
                : bi.g109b.isChecked() ? "2"
                : bi.g109c.isChecked() ? "3"
                : bi.g109d.isChecked() ? "4"
                : "-1");

        json.put("g110ax", bi.g110ax.getText().toString().trim().isEmpty() ? "-1" : bi.g110ax.getText().toString());
        json.put("g110bx", bi.g110bx.getText().toString().trim().isEmpty() ? "-1" : bi.g110bx.getText().toString());

        json.put("g111", bi.g111a.isChecked() ? "1"
                : bi.g111b.isChecked() ? "2"
                : "-1");

        json.put("g1112", bi.g1112a.isChecked() ? "1"
                : bi.g1112b.isChecked() ? "2"
                : bi.g1112x.isChecked() ? "96"
                : "-1");
        json.put("g1112xx", bi.g1112xx.getText().toString().trim().isEmpty() ? "-1" : bi.g1112xx.getText().toString());

        json.put("g1113", bi.g1113a.isChecked() ? "1"
                : bi.g1113b.isChecked() ? "2"
                : "-1");

        json.put("g1114", bi.g1114a.isChecked() ? "1"
                : bi.g1114b.isChecked() ? "2"
                : bi.g1114c.isChecked() ? "3"
                : "-1");

        json.put("g1115", bi.g1115a.isChecked() ? "1"
                : bi.g1115b.isChecked() ? "2"
                : bi.g1115c.isChecked() ? "3"
                : "-1");

        json.put("g1116", bi.g1116a.isChecked() ? "1"
                : bi.g1116b.isChecked() ? "2"
                : "-1");

        json.put("g1117", bi.g1117a.isChecked() ? "1"
                : bi.g1117b.isChecked() ? "2"
                : bi.g1117c.isChecked() ? "3"
                : bi.g1117d.isChecked() ? "4"
                : bi.g1117e.isChecked() ? "5"
                : "-1");

        MainApp.fc.setsG(String.valueOf(json));

    }


    private boolean formValidation() {
        return Validator.emptyCheckingContainer(this, bi.GrpName);
    }


    public void btnContinue(View v) {
        if (!formValidation()) return;
        try {
            SaveDraft();
        } catch (JSONException e) {
            e.printStackTrace();
        }
        if (UpdateDB()) {
            finish();
            startActivity(new Intent(this, SectionG2Activity.class));
        } else {
            Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
        }
    }

    public void btnEnd(View v) {
        openSectionMainActivity(this, "G");
    }

}
