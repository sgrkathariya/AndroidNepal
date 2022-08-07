package com.example.myapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import javax.xml.transform.Result;

public class signup extends AppCompatActivity {
    CheckBox agreed;
    Button Register;
    private EditText dob;
    private EditText first_name;
    private EditText last_name;
    private EditText email;
    private EditText gender;
    private EditText password;
    private EditText confirm_password;
    Button ShowHideBtn;
    Button ShowHidebtnForcnfmpass;
    private TextView result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        first_name = findViewById(R.id.first_name);
        last_name = findViewById(R.id.last_name);
        email = findViewById(R.id.email);
        gender = findViewById(R.id.gender);
        dob = findViewById(R.id.dob);
        password = findViewById(R.id.password);
        confirm_password = findViewById(R.id.confirm_password);
        agreed = findViewById(R.id.checkbox);
        Register = findViewById(R.id.btnRegister);
        result = findViewById(R.id.setTextView);
        ShowHideBtn = findViewById(R.id.btnShowHide);
        ShowHidebtnForcnfmpass=findViewById(R.id.btnShowHideConfirm_password);
        ShowHidebtnForcnfmpass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ShowHidebtnForcnfmpass.getText().toString().equals("Show")) {
                    confirm_password.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                    ShowHidebtnForcnfmpass.setText("Hide");
                } else {
                    confirm_password.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    ShowHidebtnForcnfmpass.setText("Show");
                }
            }
        });
        ShowHideBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ShowHideBtn.getText().toString().equals("Show")) {
                    password.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                    ShowHideBtn.setText("Hide");
                } else {
                    password.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    ShowHideBtn.setText("Show");
                }
            }
        });

        Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String message = first_name.getText().toString() + last_name.getText().toString() + email.getText().toString() + gender.getText().toString() + dob.getText().toString() + password.getText().toString() +
                        confirm_password.getText().toString() + agreed.isChecked();
//                        Toast.makeText(getApplicationContext(),message,Toast.LENGTH_LONG).show();
                result.setText(message);
            }
        });
    }
}