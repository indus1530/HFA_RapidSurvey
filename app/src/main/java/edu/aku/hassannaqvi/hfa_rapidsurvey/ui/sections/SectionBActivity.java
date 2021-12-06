package edu.aku.hassannaqvi.hfa_rapidsurvey.ui.sections;

import static edu.aku.hassannaqvi.hfa_rapidsurvey.core.MainApp.fma;
import static edu.aku.hassannaqvi.hfa_rapidsurvey.core.MainApp.form;

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
import edu.aku.hassannaqvi.hfa_rapidsurvey.databinding.ActivitySectionBBinding;
import edu.aku.hassannaqvi.hfa_rapidsurvey.ui.other.SectionMainActivity;

public class SectionBActivity extends AppCompatActivity {

    ActivitySectionBBinding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_b);
        bi.setForm(fma);
    }




    public void btnContinue(View v) {
        if (!formValidation()) return;
        if (UpdateDB()) {
            startActivity(new Intent(this, SectionMainActivity.class));
            finish();
        } else {
            Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
        }
    }


    private boolean UpdateDB() {
        DatabaseHelper db = MainApp.appInfo.getDbHelper();
        int updcount = 0;
        try {
            updcount = db.updatesFormsColumn(Tables.FormsTable.COLUMN_SB, form.sBtoString());
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

    public void btnEnd(View v) {
        //openSectionMainActivity(this, "B");
    }

}
