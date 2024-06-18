package com.example.newapp2024;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecureAutoSystemVolguActivity extends AppCompatActivity {

    Button probabilitySecureAutoSystem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secure_auto_system_volgu);

        probabilitySecureAutoSystem = findViewById(R.id.button);


        probabilitySecureAutoSystem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ProbabilitySecureAutoSystemVolguActivity.class);
                startActivity(intent);
            }
        });
    }
}