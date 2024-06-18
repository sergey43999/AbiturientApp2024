package com.example.newapp2024;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GeologVolguActivity extends AppCompatActivity {

    Button probabilityGeolog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geolog_volgu);

        probabilityGeolog = findViewById(R.id.button);


        probabilityGeolog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ProbabilityGeologVolguActivity.class);
                startActivity(intent);
            }
        });
    }
}