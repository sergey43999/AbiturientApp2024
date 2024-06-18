package com.example.newapp2024;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

public class InstPravaActivity extends AppCompatActivity {

    Button choiceSpecPravo;
    Button moreAboutPravo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inst_prava);

        moreAboutPravo = findViewById(R.id.aboutImit);
        choiceSpecPravo = findViewById(R.id.button);

        moreAboutPravo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showMoreAboutImit();
            }
        });

        choiceSpecPravo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), PravaSpecActivity.class);
                startActivity(intent);
            }
        });
    }

    private void showMoreAboutImit(){
        ConstraintLayout checkVolguConstrLayout = findViewById(R.id.moreAboutPravoConstraint);
        View view = LayoutInflater.from(InstPravaActivity.this).inflate(R.layout.more_about_pravo, checkVolguConstrLayout);

        AlertDialog.Builder builder = new AlertDialog.Builder(InstPravaActivity.this);
        builder.setView(view);
        final AlertDialog alertDialog = builder.create();


        if (alertDialog.getWindow() != null){
            alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        }
        alertDialog.show();
    }
}