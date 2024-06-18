package com.example.newapp2024;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BioInjAndBioInfIENVolguActivity extends AppCompatActivity {

    Button probabilityBioInjAndBioInf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bio_inj_and_bio_inf_ienvolgu);

        probabilityBioInjAndBioInf = findViewById(R.id.button);


        probabilityBioInjAndBioInf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ProbabilityBioInjAndBioInfIENVolguActivity.class);
                startActivity(intent);
            }
        });
    }
}