package com.example.newapp2024;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RadioTechActivity extends AppCompatActivity {

    Button probabilityRadioTech;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_tech);

        probabilityRadioTech = findViewById(R.id.button);


        probabilityRadioTech.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ProbabilityMKNActivity.class);
                startActivity(intent);
            }
        });
    }
}