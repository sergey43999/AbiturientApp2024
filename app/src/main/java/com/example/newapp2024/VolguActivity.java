package com.example.newapp2024;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class VolguActivity extends AppCompatActivity {

    Button calcChekResBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volgu);

        TextView volguLink = findViewById(R.id.textView);
        volguLink.setMovementMethod(LinkMovementMethod.getInstance());

        TextView objVolg = findViewById(R.id.textView9);
        objVolg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(VolguActivity.this, VolguObjActivity.class);
                startActivity(intent);
            }
        });

        Button choiceInst = findViewById(R.id.button2);
        choiceInst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(VolguActivity.this, InstituteVolguActivity.class);
                startActivity(intent);
            }
        });

        calcChekResBtn = findViewById(R.id.button8);
        calcChekResBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showCheckResDialogVolgu();
            }
        });
    }

    private void showCheckResDialogVolgu(){
        ConstraintLayout checkVolguConstrLayout = findViewById(R.id.CheckWithoutEkzVolgu);
        View view = LayoutInflater.from(VolguActivity.this).inflate(R.layout.check_without_ekz_volgu, checkVolguConstrLayout);
        Button endWindow = view.findViewById(R.id.endBtnVolguCheckWithoutEkz);

        AlertDialog.Builder builder = new AlertDialog.Builder(VolguActivity.this);
        builder.setView(view);
        final AlertDialog alertDialog = builder.create();

        endWindow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alertDialog.dismiss();
            }
        });
        if (alertDialog.getWindow() != null){
            alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        }
        alertDialog.show();
    }
}