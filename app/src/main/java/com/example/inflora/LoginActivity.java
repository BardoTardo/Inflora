package com.example.inflora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);
        //text fields

        TextView emailAddress = (TextView) findViewById(R.id.editEmailAddress);
        TextView password = (TextView) findViewById(R.id.editPassword);

        //buttons

        Button loginbtn = (Button) findViewById(R.id.signin_button);
        //admin user

        loginbtn.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View v) {
            if(emailAddress.getText().toString().equals("Inflora@google.com") && password.getText().toString().equals("Inflora")) {

            Toast.makeText(LoginActivity.this, "LOGIN SUCCESSFUL", Toast.LENGTH_SHORT).show();

            openLoginActivity();
            }else
            //incorrect
            Toast.makeText(LoginActivity.this, "LOGIN FAILED",Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void openLoginActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}