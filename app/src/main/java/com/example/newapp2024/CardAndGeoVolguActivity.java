package com.example.newapp2024;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CardAndGeoVolguActivity extends AppCompatActivity {

    Button probabilityCardAndGeo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_and_geo_volgu);

        probabilityCardAndGeo = findViewById(R.id.button);


        probabilityCardAndGeo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ProbabilityCardAndGeoVolguActivity.class);
                startActivity(intent);
            }
        });
    }
}