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

public class IMITVolguActivity extends AppCompatActivity {

    Button moreAboutIMIT;
    Button choiceSpecIMIT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imitvolgu);


        moreAboutIMIT = findViewById(R.id.aboutImit);
        choiceSpecIMIT = findViewById(R.id.button);
        moreAboutIMIT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showMoreAboutImit();
            }
        });

        choiceSpecIMIT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), IMITSpecActivity.class);
                startActivity(intent);
            }
        });
    }





    private void showMoreAboutImit(){
        ConstraintLayout checkVolguConstrLayout = findViewById(R.id.moreAboutImitConstraint);
        View view = LayoutInflater.from(IMITVolguActivity.this).inflate(R.layout.more_about_imit, checkVolguConstrLayout);

        AlertDialog.Builder builder = new AlertDialog.Builder(IMITVolguActivity.this);
        builder.setView(view);
        final AlertDialog alertDialog = builder.create();


        if (alertDialog.getWindow() != null){
            alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        }
        alertDialog.show();
    }

}