package com.example.domenico.Zarathustra;

import android.content.Intent;
import android.graphics.PorterDuff;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.domenico.Zarathustra.backend.api.API;
import com.example.domenico.Zarathustra.backend.api.SharedPreferencesManager;

public class Login extends AppCompatActivity {
    String user, pass;
    EditText username;
    EditText password;
    Button doLogin;
    TextView error;
    String errorMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setVisible(false);
        API.init(this);
        SharedPreferencesManager.init(getApplicationContext());
        setContentView(R.layout.activity_login);
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        doLogin = findViewById(R.id.login_button);
        error = findViewById(R.id.error);
        Beacon[] beacons = {
                new Beacon ("62263", new PercentagePosition (0.05, 0.05)),
                new Beacon ("6146", new PercentagePosition (0.02, 0.22)),
                new Beacon ("6130", new PercentagePosition (0.15, 0.32)),
                new Beacon ("6124", new PercentagePosition (0.295, 0.295)),
                new Beacon ("6125",  new PercentagePosition (0.68, 0.295)),
                new Beacon ("6134", new PercentagePosition (0.295, 0.71)),
                new Beacon ("6135", new PercentagePosition (0.68, 0.71)),
                new Beacon ("64520", new PercentagePosition (0.895, 0.24)),
                new Beacon ("38748", new PercentagePosition (0.895, 0.595))
        };
        BeaconInfo.init (this, beacons);
        final Intent goToHomePage = new Intent(Login.this, HomePage.class);
        if (API.getInstance().isSessionAlreadyStarted()) {
            finish();
            startActivity(goToHomePage);
            return;
        } else {
            doLogin.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    user = username.getText().toString().trim();
                    pass = password.getText().toString();
                    if (API.getInstance().loginValidation(user, pass)) {
                        finish();
                        startActivity(goToHomePage);
                        username.getBackground().setColorFilter(getResources().getColor(R.color.Transparent),
                                PorterDuff.Mode.SRC_ATOP);
                        password.getBackground().setColorFilter(getResources().getColor(R.color.Transparent),
                                PorterDuff.Mode.SRC_ATOP);
                        error.setVisibility(View.INVISIBLE);
                        return;
                    } else if (user.equals("") && !pass.equals("")) {
                        errorMessage = "username required";
                        username.getBackground().setColorFilter(getResources().getColor(R.color.monkRed),
                                PorterDuff.Mode.SRC_ATOP);
                        password.getBackground().setColorFilter(getResources().getColor(R.color.Transparent),
                                PorterDuff.Mode.SRC_ATOP);
                        error.setVisibility(View.VISIBLE);
                    } else if (pass.equals("") && !user.equals("")) {
                        errorMessage = "password required";
                        password.getBackground().setColorFilter(getResources().getColor(R.color.monkRed),
                                PorterDuff.Mode.SRC_ATOP);
                        username.getBackground().setColorFilter(getResources().getColor(R.color.Transparent),
                                PorterDuff.Mode.SRC_ATOP);
                        error.setVisibility(View.VISIBLE);
                    } else if (user.equals("") && pass.equals("")) {
                        errorMessage = "username and password required";
                        username.getBackground().setColorFilter(getResources().getColor(R.color.monkRed),
                                PorterDuff.Mode.SRC_ATOP);
                        password.getBackground().setColorFilter(getResources().getColor(R.color.monkRed),
                                PorterDuff.Mode.SRC_ATOP);
                        error.setVisibility(View.VISIBLE);
                    } else if (!API.getInstance().loginValidation(user, pass)) {
                        errorMessage = "Incorrect username or password ";
                        username.getBackground().setColorFilter(getResources().getColor(R.color.monkRed),
                                PorterDuff.Mode.SRC_ATOP);
                        password.getBackground().setColorFilter(getResources().getColor(R.color.monkRed),
                                PorterDuff.Mode.SRC_ATOP);
                        error.setVisibility(View.VISIBLE);
                    }
                    error.setText(errorMessage);
                }

            });
            setVisible(true);
        }
    }
}
