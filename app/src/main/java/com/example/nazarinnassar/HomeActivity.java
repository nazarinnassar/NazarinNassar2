package com.example.nazarinnassar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    EditText editTextNumber1 , editTextNumber2;
    Button buttonMinus, buttonPlus ;
    TextView textViewResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        // linking objects w design by id
        editTextNumber1 = findViewById(R.id. editTextNumber1);
        editTextNumber2 = findViewById(R.id.editTextNumber2);

        buttonMinus = findViewById(R.id.minus);
        buttonPlus = findViewById(R.id.Plus);

        textViewResult = findViewById(R.id.textViewResult);

    }



    public void plus(View view) {
        double number1 = Double.parseDouble(editTextNumber1.getText().toString());
        double number2 = Double.parseDouble(editTextNumber2.getText().toString());

        textViewResult.setText((number1+number2)+"");
    }
    public void minus (View view) {
        double number1 = Double.parseDouble(editTextNumber1.getText().toString());
        double number2 = Double.parseDouble(editTextNumber2.getText().toString());

        textViewResult.setText((number1 + number2) + "");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.navigation_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        //in case user chose about menu
        if (item.getItemId() == R.id.about_menu) {
            // open the about activity when the about menu selected
        }
            Intent i = new Intent(this, AboutActivity.class);
            startActivity(i);
        return true;
        }


}