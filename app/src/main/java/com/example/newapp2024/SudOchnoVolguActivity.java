package com.example.newapp2024;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SudOchnoVolguActivity extends AppCompatActivity {

    Button probabilitySudOcho;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sud_ochno_volgu);



        probabilitySudOcho = findViewById(R.id.button);


        probabilitySudOcho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ProbabilityMKNActivity.class);
                startActivity(intent);
            }
        });
    }


}