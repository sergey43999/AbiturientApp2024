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

public class IENVolguActivity extends AppCompatActivity {

    Button choiceSpecPravo;
    Button moreAboutPravo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ienvolgu);

        moreAboutPravo = findViewById(R.id.aboutIen);
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
                Intent intent = new Intent(getApplicationContext(), IENSpecVolguActivity.class);
                startActivity(intent);
            }
        });
    }

    private void showMoreAboutImit(){
    ConstraintLayout checkVolguConstrLayout = findViewById(R.id.moreAboutIenConstraint);
    View view = LayoutInflater.from(IENVolguActivity.this).inflate(R.layout.more_about_ien, checkVolguConstrLayout);

    AlertDialog.Builder builder = new AlertDialog.Builder(IENVolguActivity.this);
        builder.setView(view);
    final AlertDialog alertDialog = builder.create();


        if (alertDialog.getWindow() != null){
        alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
    }
        alertDialog.show();
}
}