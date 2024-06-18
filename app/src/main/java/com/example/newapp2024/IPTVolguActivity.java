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

import java.sql.SQLData;

public class IPTVolguActivity extends AppCompatActivity {

    Button moreAboutIPT;
    Button choiceSpecIPT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iptvolgu);

        moreAboutIPT = findViewById(R.id.aboutImit);
        choiceSpecIPT = findViewById(R.id.button);
        moreAboutIPT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showMoreAboutImit();
            }
        });

        choiceSpecIPT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), IPTVolguSpecActivity.class);
                startActivity(intent);
            }
        });
    }

    private void showMoreAboutImit(){
        ConstraintLayout checkVolguConstrLayout = findViewById(R.id.moreAboutIPTConstraint);
        View view = LayoutInflater.from(IPTVolguActivity.this).inflate(R.layout.more_about_ipt, checkVolguConstrLayout);

        AlertDialog.Builder builder = new AlertDialog.Builder(IPTVolguActivity.this);
        builder.setView(view);
        final AlertDialog alertDialog = builder.create();


        if (alertDialog.getWindow() != null){
            alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        }
        alertDialog.show();
    }


}