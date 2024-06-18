package com.example.newapp2024;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RadioElSystemVolguActivity extends AppCompatActivity {

    Button probabilityRadioElSystem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_el_system_volgu);

        probabilityRadioElSystem = findViewById(R.id.button);


        probabilityRadioElSystem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ProbabilityRadioElSystemVolguActivity.class);
                startActivity(intent);
            }
        });
    }
}