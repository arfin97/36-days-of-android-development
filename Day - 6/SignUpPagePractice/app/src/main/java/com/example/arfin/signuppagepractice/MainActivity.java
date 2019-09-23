package com.example.arfin.signuppagepractice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  {

    private TextView etFirstName;
    private TextView etLastName;
    private RadioGroup rgGender;
    private RadioButton rbMale;
    private RadioButton rbFemale;
    private EditText etEmail;
    private EditText etPassword;
    private AutoCompleteTextView actBloodGroup;
    private CheckBox cbTnc;
    private Button btnSignup;
    private String bloodGroupData[] = {"A+", "A-", "B+", "AB+", "AB-"};

    String firstName;
    String lastName;
    String email;
    String password;
    Boolean checked;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();



        cbTnc.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    btnSignup.setVisibility(View.VISIBLE);
                }
                else{
                    btnSignup.setVisibility(View.GONE);
                }
            }
        });


        btnSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checkFormFieldsCompleteStatus() == true) {
                    goToHomePageActivity();
                }

            }
        });
    }

    private boolean checkFormFieldsCompleteStatus() {
        firstName = etFirstName.getText().toString();
        lastName = etLastName.getText().toString();
        email = etEmail.getText().toString();
        password = etPassword.getText().toString();
        checked = cbTnc.isChecked();

        if (firstName.matches("") || lastName.matches("") || email.matches("") || password.matches("")) {
            Toast.makeText(this, "Please Fillup all the fields", Toast.LENGTH_SHORT).show();
            return false;
        }
        else if(rgGender.getCheckedRadioButtonId() == -1){
            Toast.makeText(this, "Select Gender", Toast.LENGTH_SHORT).show();
            return false;
        }
        else{
            return true;
        }
    }

    private void goToHomePageActivity() {
        Intent intent = new Intent(MainActivity.this, HomePage.class);
        intent.putExtra("firstName", firstName);
        intent.putExtra("lastName", lastName);
        intent.putExtra("email", email);
        intent.putExtra("password", password);
        intent.putExtra("checked", checked);

        startActivity(intent);
    }

    private void init() {
        etFirstName = findViewById(R.id.etFirstName);
        etLastName = findViewById(R.id.etLastName);
        rgGender = findViewById(R.id.rgGender);
        rbMale = findViewById(R.id.rbMale);
        rbFemale = findViewById(R.id.rbFemale);
        etEmail = findViewById(R.id.etEmail);
        etPassword = findViewById(R.id.etPassword);
        actBloodGroup = findViewById(R.id.actBloodGroup);
        cbTnc = findViewById(R.id.cbTnc);
        btnSignup = findViewById(R.id.btnSignup);

        ArrayAdapter bloodGroupDataAdapter = new ArrayAdapter(MainActivity.this, R.layout.support_simple_spinner_dropdown_item, bloodGroupData);
        actBloodGroup.setThreshold(1);
        actBloodGroup.setAdapter(bloodGroupDataAdapter);
    }
}
