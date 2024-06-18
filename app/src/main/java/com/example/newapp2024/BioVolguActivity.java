package com.example.newapp2024;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BioVolguActivity extends AppCompatActivity {

    Button probabilityBio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bio_volgu);

        probabilityBio = findViewById(R.id.button);


        probabilityBio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ProbabilityBioVolguActivity.class);
                startActivity(intent);
            }
        });
    }
}