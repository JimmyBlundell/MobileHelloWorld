package com.example.mobilehelloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.login);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                EditText username = (EditText) findViewById(R.id.username);
                EditText password = (EditText) findViewById(R.id.password);
                if (!username.getText().toString().equals("admin") && !password.getText().toString().equals("password")) {
                    new AlertDialog.Builder(MainActivity.this)
                            .setTitle("Uh oh!")
                            .setMessage("Invalid username/password")
                            .setNegativeButton(android.R.string.no, null)
                            .setIcon(android.R.drawable.ic_dialog_alert)
                            .show();
                } else {
                    goToHomeScreen();
                }
            }
        });
    }

    public void goToHomeScreen() {
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
    }
}