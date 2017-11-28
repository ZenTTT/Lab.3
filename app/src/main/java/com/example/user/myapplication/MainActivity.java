package com.example.user.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private Spinner spinnerAge;
    private RadioGroup radioGroupGender;
    private RadioButton radioButtonMale, radioButtonFemale;
    private CheckBox checkBoxSmoker;
    private TextView textViewPremium;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Linking UI to program
        spinnerAge = (Spinner)findViewById(R.id.spinnerAge);
        radioGroupGender = (RadioGroup)findViewById(R.id.radioGroupGender);
        radioButtonFemale = (RadioButton)findViewById(R.id.radioButtonFemale);
        radioButtonMale = (RadioButton)findViewById(R.id.radioButtonMale);
        checkBoxSmoker = (CheckBox)findViewById(R.id.checkBoxSmoker);
        textViewPremium =(TextView)findViewById(R.id.textViewPremium);


        //Create an adaptor
        ArrayAdapter<CharSequence> adapter =
                ArrayAdapter.createFromResource(this, R.array.age_group,android.R.layout.simple_spinner_item);

                adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);

                spinnerAge.setOnItemSelectedListener(this);
                spinnerAge.setAdapter(adapter);

    }

    public void calculatePremium(View view){
        int pos;
        pos = spinnerAge.getSelectedItemPosition();

        int gender;
        gender = radioGroupGender.getCheckedRadioButtonId();
        if(gender == R.id.radioButtonMale){
            //TODO: calculate premium of male
        }else{
            //TODO: calculate premium of female
        }
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
