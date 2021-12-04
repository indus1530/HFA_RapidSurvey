package edu.aku.hassannaqvi.hfa_rapidsurvey.ui.sections;

import static edu.aku.hassannaqvi.hfa_rapidsurvey.core.MainApp.form;
import static edu.aku.hassannaqvi.hfa_rapidsurvey.utils.UtilKt.openSectionMainActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Validator;

import org.json.JSONException;

import edu.aku.hassannaqvi.hfa_rapidsurvey.R;
import edu.aku.hassannaqvi.hfa_rapidsurvey.contracts.Tables;
import edu.aku.hassannaqvi.hfa_rapidsurvey.core.DatabaseHelper;
import edu.aku.hassannaqvi.hfa_rapidsurvey.core.MainApp;
import edu.aku.hassannaqvi.hfa_rapidsurvey.databinding.ActivitySectionG1Binding;


public class SectionG1Activity extends AppCompatActivity {

    ActivitySectionG1Binding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_g1);
        bi.setForm(form);
        setupSkips();

    }


    private void setupSkips() {

        /*bi.g0111.setOnCheckedChangeListener(((radioGroup, i) -> {
            Clear.clearAllFields(bi.fldGrpCVg01112);
        }));

        bi.g01113.setOnCheckedChangeListener(((radioGroup, i) -> {
            Clear.clearAllFields(bi.fldGrpCVg01114);
        }));*/

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
        int updcount = 0;
        try {
            updcount = db.updatesFormColumn(Tables.FormsTable.COLUMN_SG, form.sGtoString());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        if (updcount == 1) {
            return true;
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
            return false;
        }
    }


    private boolean formValidation() {
        return Validator.emptyCheckingContainer(this, bi.GrpName);
    }


    public void btnContinue(View v) {
        if (!formValidation()) return;
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
