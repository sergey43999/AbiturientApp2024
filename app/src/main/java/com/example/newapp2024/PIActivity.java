package com.example.newapp2024;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PIActivity extends AppCompatActivity {

    Button probabilityPI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_piactivity);

        probabilityPI = findViewById(R.id.button);


        probabilityPI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ProbabilityMKNActivity.class);
                startActivity(intent);
            }
        });
    }
}