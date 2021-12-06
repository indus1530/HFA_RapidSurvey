package edu.aku.hassannaqvi.hfa_rapidsurvey.ui.sections;

import static java.lang.Float.parseFloat;
import static edu.aku.hassannaqvi.hfa_rapidsurvey.core.MainApp.fma;
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
        bi.setForm(fma);
        setupTextWatchers();
    }


    private void setupTextWatchers() {
        editTextImplementation(bi.c101a, new EditTextPicker[]{bi.c101b, bi.c101d, bi.c101e}, bi.c101c);
        editTextImplementation(bi.c102a, new EditTextPicker[]{bi.c102b, bi.c102d, bi.c102e}, bi.c102c);
        editTextImplementation(bi.c103a, new EditTextPicker[]{bi.c103b, bi.c103d, bi.c103e}, bi.c103c);
        editTextImplementation(bi.c104a, new EditTextPicker[]{bi.c104b, bi.c104d, bi.c104e}, bi.c104c);
        editTextImplementation(bi.c105a, new EditTextPicker[]{bi.c105b, bi.c105d, bi.c105e}, bi.c105c);
        editTextImplementation(bi.c106a, new EditTextPicker[]{bi.c106b, bi.c106d, bi.c106e}, bi.c106c);
        editTextImplementation(bi.c107a, new EditTextPicker[]{bi.c107b, bi.c107d, bi.c107e}, bi.c107c);
        editTextImplementation(bi.c108a, new EditTextPicker[]{bi.c108b, bi.c108d, bi.c108e}, bi.c108c);
        editTextImplementation(bi.c109a, new EditTextPicker[]{bi.c109b, bi.c109d, bi.c109e}, bi.c109c);
        editTextImplementation(bi.c110a, new EditTextPicker[]{bi.c110b, bi.c110d, bi.c110e}, bi.c110c);
        editTextImplementation(bi.c111a, new EditTextPicker[]{bi.c111b, bi.c111d, bi.c111e}, bi.c111c);
        editTextImplementation(bi.c112a, new EditTextPicker[]{bi.c112b, bi.c112d, bi.c112e}, bi.c112c);
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
