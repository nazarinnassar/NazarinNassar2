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
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editTextEmail, editTextPassword ;
 Button buttonLogin, buttonSignUp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

     editTextEmail = findViewById (R.id.EmailAddress);
        editTextPassword = findViewById (R.id.Password);

     buttonLogin = findViewById(R.id.Login);
        buttonSignUp = findViewById(R.id.SignUp);

    }

    public void login(View view) {
        if(editTextEmail.getText() .toString().equals(""))
            Toast.makeText( this,"Empty Email" ,Toast.LENGTH_LONG).show();
        else if (editTextPassword.getText() .toString().equals(""));
            Toast.makeText( this,"Empty Password" ,Toast.LENGTH_LONG).show();

    }
    // load option menu from an activity onto the design

    @Override
    public boolean onCreateOptionsMenu(@NonNull Menu menu) {
        getMenuInflater().inflate(R.menu.menu_example, menu);
        return true;
    }

    // handle options menu click events

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.setting_menu:
                Intent i = new Intent( this, ListActivity.class);
                start
                Toast.makeText(MainActivity.this, "settings clicked", Toast.LENGTH_LONG).show();
            case R.id.help_menu:
                Toast.makeText(MainActivity.this, "help clicked", Toast.LENGTH_LONG).show();
            case R.id.logout_menu:
                Toast.makeText(MainActivity.this, "logout clicked", Toast.LENGTH_LONG).show();
        }
        return true;
    }
    // is called when the user clicks the back button
    @Override
    public void onBackPressed() {
        AlertDialog.Builder dialog = new AlertDialog.Builder(this);
        dialog.setTitle("Back button was pressed");
        dialog.setMessage("Are you sure you want to Exit");
        // in case the user chose no, Nothing Happens, the dialog closes
        dialog.setNegativeButton("NO", null);
        // when the yes button is clicked the application closes
        dialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                MainActivity.this.finish();
            }
        });
        dialog.setIcon(R.drawable.ic_baseline_wc_24);
        AlertDialog alertDialog = dialog.create();
        alertDialog.show();
    }

}
