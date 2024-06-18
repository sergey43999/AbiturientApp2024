package com.example.newapp2024;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecureTeleSystemVolguActivity extends AppCompatActivity {

    Button probabilitySecureTeleSystem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secure_tele_system_volgu);

        probabilitySecureTeleSystem = findViewById(R.id.button);


        probabilitySecureTeleSystem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ProbabilitySecureTeleSystemVolguActivity.class);
                startActivity(intent);
            }
        });
    }
}