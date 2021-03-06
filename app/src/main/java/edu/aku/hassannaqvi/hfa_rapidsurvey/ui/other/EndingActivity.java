package edu.aku.hassannaqvi.hfa_rapidsurvey.ui.other;

import static edu.aku.hassannaqvi.hfa_rapidsurvey.CONSTANTS.SECTION_MAIN_CHECK_FOR_END;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Validator;

import java.text.SimpleDateFormat;
import java.util.Date;

import edu.aku.hassannaqvi.hfa_rapidsurvey.R;
import edu.aku.hassannaqvi.hfa_rapidsurvey.contracts.PatientsContract;
import edu.aku.hassannaqvi.hfa_rapidsurvey.core.DatabaseHelper;
import edu.aku.hassannaqvi.hfa_rapidsurvey.core.MainApp;
import edu.aku.hassannaqvi.hfa_rapidsurvey.databinding.ActivityEndingBinding;
import edu.aku.hassannaqvi.hfa_rapidsurvey.ui.sections.SectionI1Activity;

public class EndingActivity extends AppCompatActivity {

    ActivityEndingBinding bi;
    boolean sectionMainCheck;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        bi = DataBindingUtil.setContentView(this, R.layout.activity_ending);
        bi.setCallback(this);

        boolean check = getIntent().getBooleanExtra("complete", false);
        sectionMainCheck = getIntent().getBooleanExtra(SECTION_MAIN_CHECK_FOR_END, false);

        if (check) {
            bi.istatusa.setEnabled(true);
            bi.istatusb.setEnabled(false);
            bi.istatus96.setEnabled(false);
        } else {
            bi.istatusa.setEnabled(false);
            bi.istatusb.setEnabled(true);
            bi.istatus96.setEnabled(true);
        }

//
    }


    public void btnEnd(View v) {
        if (!formValidation()) return;
        SaveDraft();
        if (UpdateDB()) {
            finish();
            startActivity(new Intent(this, sectionMainCheck ? routingSelectionForChildEnding() : MainActivity.class));
        } else {
            Toast.makeText(this, "Error in updating db!!", Toast.LENGTH_SHORT).show();
        }
    }

    private Class<?> routingSelectionForChildEnding() {
        if (MainApp.fc.getA10().equals("1") && SectionMainActivity.countI == 6)
            return SectionMainActivity.class;
        else if (MainApp.fc.getA10().equals("2") && SectionMainActivity.countI == 3)
            return SectionMainActivity.class;
        else
            return SectionI1Activity.class;
    }


    private void SaveDraft() {

        if (sectionMainCheck) {
            MainApp.psc.setStatus(bi.istatusa.isChecked() ? "1"
                    : bi.istatusb.isChecked() ? "2"
                    : bi.istatus96.isChecked() ? "96"
                    : "0");
            MainApp.fc.setsI(String.valueOf(SectionMainActivity.countI));
        } else {
            MainApp.fc.setIstatus(bi.istatusa.isChecked() ? "1"
                    : bi.istatusb.isChecked() ? "2"
                    : bi.istatus96.isChecked() ? "96"
                    : "0");

            MainApp.fc.setIstatus88x(bi.istatus96x.getText().toString());
            MainApp.fc.setEndingdatetime(new SimpleDateFormat("dd-MM-yy HH:mm").format(new Date().getTime()));
        }
    }


    public boolean UpdateDB() {
        DatabaseHelper db = MainApp.appInfo.getDbHelper();
        int updcount;
        if (sectionMainCheck) {
            updcount = db.updatesPSCColumn(PatientsContract.PatientsTable.COLUMN_STATUS, MainApp.psc.getStatus());
            if (updcount == 1)
                updcount = db.updatesFormColumn(FormsContract.FormsTable.COLUMN_SI, MainApp.fc.getsI());
        } else
            updcount = db.updateEnding();

        if (updcount == 1) {
            return true;
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
            return false;
        }

    }


    private boolean formValidation() {
        return Validator.emptyCheckingContainer(this, bi.fldGrpEnd);
    }


    @Override
    public void onBackPressed() {
        Toast.makeText(getApplicationContext(), "Back Press Not Allowed", Toast.LENGTH_LONG).show();
    }

}
