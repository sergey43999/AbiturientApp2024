package com.example.newapp2024;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CompSecureActivity extends AppCompatActivity {

    Button probabilityCompSecure;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comp_secure);

        probabilityCompSecure = findViewById(R.id.button);


        probabilityCompSecure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ProbabilityCompSecureActivity.class);
                startActivity(intent);
            }
        });
    }
}