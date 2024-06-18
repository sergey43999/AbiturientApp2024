package com.example.newapp2024;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FotonActivity extends AppCompatActivity {


    Button probabilityFoton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foton);

        probabilityFoton = findViewById(R.id.button);


        probabilityFoton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ProbabilityMKNActivity.class);
                startActivity(intent);
            }
        });
    }
}