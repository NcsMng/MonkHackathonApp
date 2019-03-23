package com.example.domenico.Zarathustra;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Login extends AppCompatActivity {
    String user, pass;
    EditText username;
    EditText password;
    Button doLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        doLogin = findViewById(R.id.login_button);
        Intent goToHomePage = new Intent(Login.this, HomePage.class);
        /*if (sessionAlreadyStarted) {
            startActivity(goToHomePage);
        } else {
            doLogin.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    user = username.getText().toString();
                    pass = password.getText().toString();
                    if (loginValidation(user, pass)) {
                        startActivity(goToHomePage);
                    }else{

                    }
                }
            });
        }*/
    }
}
