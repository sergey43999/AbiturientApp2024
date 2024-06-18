package com.example.newapp2024;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LandArchitectureActivity extends AppCompatActivity {

    Button probabilityLandArchitecture;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_land_architecture);

        probabilityLandArchitecture = findViewById(R.id.button);


        probabilityLandArchitecture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ProbabilityLandArchitectureActivity.class);
                startActivity(intent);
            }
        });
    }
}