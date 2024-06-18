package com.example.newapp2024;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PMIActivity extends AppCompatActivity {

    Button studyImit;
    Button probabilityPMI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pmiactivity);

        probabilityPMI = findViewById(R.id.button);


        probabilityPMI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ProbabilityPMIActivity.class);
                startActivity(intent);
            }
        });
    }
}