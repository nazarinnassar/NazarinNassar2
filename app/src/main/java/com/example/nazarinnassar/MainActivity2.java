package com.example.nazarinnassar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2<etMail, btnLogin, btnSignup, buttonLogin, buttonRegister> extends AppCompatActivity {

    private EditText etEmail, etPassword ;
    private Button btLogin, btSignup ;
    private TextView tvSignup, tvWelcome;

    private final String valid_mail = "admin";
    private final String valid_password = "1";
    SharedPreferences preferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    @Override
    protected void onCreate (Bundle savedInstanceState)
    setContentView(R.layout.activity_main);

    etMail = findViewById(R.id.editTextTextEmailAddress);
    etPassword = findViewById(R.id.editTextTextPassword) {

    }

    btnLogin = findViewById(R.id‚buttonLogin);
    btnSignup = findViewById(R.id‚buttonRegister);
    }
    prefrences = getSharedPrefrences("Userinfo",0);

    public void register(View view) {
        Intent i_register = new Intent(this, RegisterActivity.class);
    }

}