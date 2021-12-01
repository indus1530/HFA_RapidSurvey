package edu.aku.hassannaqvi.hfa_rapidsurvey.ui.sections;

import static java.lang.Float.parseFloat;
import static edu.aku.hassannaqvi.hfa_rapidsurvey.core.MainApp.form;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.edittextpicker.aliazaz.EditTextPicker;
import com.validatorcrawler.aliazaz.Validator;

import org.json.JSONException;

import edu.aku.hassannaqvi.hfa_rapidsurvey.R;
import edu.aku.hassannaqvi.hfa_rapidsurvey.contracts.Tables;
import edu.aku.hassannaqvi.hfa_rapidsurvey.core.DatabaseHelper;
import edu.aku.hassannaqvi.hfa_rapidsurvey.core.MainApp;
import edu.aku.hassannaqvi.hfa_rapidsurvey.databinding.ActivitySectionC1Binding;

public class SectionC1Activity extends AppCompatActivity {

    ActivitySectionC1Binding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_c1);
        bi.setForm(form);
        setupTextWatchers();
    }


    private void setupTextWatchers() {
        editTextImplementation(bi.c101a, new EditTextPicker[]{bi.c101b, bi.c101d, bi.c101e}, bi.c101c);
       /* editTextImplementation(bi.c01ba, new EditTextPicker[]{bi.c01bb, bi.c01bd, bi.c01be}, bi.c01bc);
        editTextImplementation(bi.c01ca, new EditTextPicker[]{bi.c01cb, bi.c01cd, bi.c01ce}, bi.c01cc);
        editTextImplementation(bi.c01da, new EditTextPicker[]{bi.c01db, bi.c01dd, bi.c01de}, bi.c01dc);
        editTextImplementation(bi.c01ea, new EditTextPicker[]{bi.c01eb, bi.c01ed, bi.c01ee}, bi.c01ec);
        editTextImplementation(bi.c01fa, new EditTextPicker[]{bi.c01fb, bi.c01fd, bi.c01fe}, bi.c01fc);
        editTextImplementation(bi.c01ga, new EditTextPicker[]{bi.c01gb, bi.c01gd, bi.c01ge}, bi.c01gc);
        editTextImplementation(bi.c01ha, new EditTextPicker[]{bi.c01hb, bi.c01hd, bi.c01he}, bi.c01hc);
        editTextImplementation(bi.c01ia, new EditTextPicker[]{bi.c01ib, bi.c01id, bi.c01ie}, bi.c01ic);
        editTextImplementation(bi.c01ja, new EditTextPicker[]{bi.c01jb, bi.c01jd, bi.c01je}, bi.c01jc);
        editTextImplementation(bi.c01ka, new EditTextPicker[]{bi.c01kb, bi.c01kd, bi.c01ke}, bi.c01kc);
        editTextImplementation(bi.c01la, new EditTextPicker[]{bi.c01lb, bi.c01ld, bi.c01le}, bi.c01lc);*/
    }


    public void editTextImplementation(EditTextPicker edit01, EditTextPicker[] editTextsArray, EditTextPicker edit02) {

        edit01.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (TextUtils.isEmpty(edit01.getText()))
                    return;
                for (EditTextPicker item : editTextsArray) {
                    item.setMaxvalue(Integer.parseInt(edit01.getText().toString().trim()));
                }
            }
        });


        editTextsArray[0].addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (TextUtils.isEmpty(edit01.getText()) || TextUtils.isEmpty(editTextsArray[0].getText()))
                    return;
                edit02.setText("");
                edit02.setEnabled(false);
                editTextsArray[1].setMaxvalue(Integer.parseInt(editTextsArray[0].getText().toString().trim()));
                editTextsArray[2].setMaxvalue(Integer.parseInt(editTextsArray[0].getText().toString().trim()));
                edit02.setText(String.valueOf(parseFloat(edit01.getText().toString().trim()) - parseFloat(editTextsArray[0].getText().toString().trim())));

            }

            @Override
            public void afterTextChanged(Editable editable) {
            }
        });

    }


    private boolean UpdateDB() {
        DatabaseHelper db = MainApp.appInfo.getDbHelper();
        int updcount = 0;
        try {
            updcount = db.updatesFormsColumn(Tables.FormsTable.COLUMN_SC, form.sCtoString());
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
            startActivity(new Intent(this, SectionC2Activity.class));
        } else {
            Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
        }
    }

    public void btnEnd(View v) {
        //openSectionMainActivity(this, "C");
    }
}
