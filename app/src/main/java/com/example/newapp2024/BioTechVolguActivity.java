package com.example.newapp2024;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BioTechVolguActivity extends AppCompatActivity {

    Button probabilityBioTech;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bio_tech_volgu);

        probabilityBioTech = findViewById(R.id.button);


        probabilityBioTech.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ProbabilityBioTechVolguActivity.class);
                startActivity(intent);
            }
        });
    }
}