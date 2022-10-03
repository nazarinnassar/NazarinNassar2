package com.example.nazarinnassar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

 package com.example.mymail;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget. Toast;
public abstract class Register<etMail, etPassword, btnRegister, btnCancel, preferences> extends AppCompatActivity {
        private EditText etMail, etPassword; private Button btnRegister, btnCancel;
        private TextView tvWelcome;
        SharedPreferences preferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }
        etMail = findViewById(R.id.editTextTextEmailAddress);
        etPassword = findViewById(R.id.editTextTextPassword);
        btnRegister = abstract findViewById(R.id.buttonRegister);
        btnCancel = abstract findViewById(R.id.Cancel);
        preferences = abstract void getSharedPreferences("Userinfo",0);

    public void register (View view) 1
    String input_mail = etMail.getText().toString0);
    String input_password = etPassword.getText().toString();
 if(input_mail.length()>0) {
//open preferences file
        SharedPreferences.Editor editor = preferences.edit);
//save key,value data
editor.putString( "username", input_mail); editor.putString(  "password", input_password);
        editor.apply);
        Toast.makeText ( this,"User registered!", Toast.LENGTH_LONG).show();
        Intent intent_main = new Intent(  this, MainActivity.
        startActivity(intent_main);