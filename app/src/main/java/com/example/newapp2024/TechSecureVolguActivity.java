package com.example.newapp2024;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TechSecureVolguActivity extends AppCompatActivity {

    Button probabilityTechSecure;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tech_secure_volgu);

        probabilityTechSecure = findViewById(R.id.button);


        probabilityTechSecure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ProbabilityTechSecureVolguActivity.class);
                startActivity(intent);
            }
        });
    }
}