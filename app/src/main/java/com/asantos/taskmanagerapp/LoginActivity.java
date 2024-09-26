package com.asantos.taskmanagerapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

   // private final String USERNAME = "admin";
  //  private final String PASSWORD = "1234";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final EditText usernameInput = findViewById(R.id.usernameInput);
        final EditText passwordInput = findViewById(R.id.passwordInput);
        Button loginButton = findViewById(R.id.loginButton);

        /* AUTENTICAÇÃO
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = usernameInput.getText().toString();
                String password = passwordInput.getText().toString();

                if (username.equals(USERNAME) && password.equals(PASSWORD)) {
                    // Login ok
                    startActivity(new Intent(LoginActivity.this, MainActivity.class));
                    finish();
                } else {
                    // Falha na autenticação
                    Toast.makeText(LoginActivity.this, "Credenciais incorretas", Toast.LENGTH_SHORT).show();
                }
            }
        });
        */

    }
}