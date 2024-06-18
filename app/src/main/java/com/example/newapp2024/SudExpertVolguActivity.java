package com.example.newapp2024;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SudExpertVolguActivity extends AppCompatActivity {

    Button probabilitySudExpert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sud_expert_volgu);

        probabilitySudExpert = findViewById(R.id.button);


        probabilitySudExpert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ProbabilitySudExpertVolguActivity.class);
                startActivity(intent);
            }
        });
    }
}