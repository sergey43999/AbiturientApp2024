package com.example.newapp2024;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ProbabilityUrSprudZaOchniVolguActivity extends AppCompatActivity {

    EditText editTextRussian;
    EditText editTextMath;
    EditText editTextEnglish;
    EditText editTextHistory;
    EditText editTextInfo;
    Button calcProb;
    String probabilityNew;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_probability_ur_sprud_za_ochni_volgu);

        editTextEnglish = findViewById(R.id.editTextTEnglish);
        editTextHistory = findViewById(R.id.editTextTHitory);
        editTextInfo = findViewById(R.id.editTextInfo);
        editTextMath = findViewById(R.id.editTextMath);
        editTextRussian = findViewById(R.id.editTextRussian);


        calcProb = findViewById(R.id.calcProb);
        calcProb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editTextMath.getText().toString().isEmpty() && editTextRussian.getText().toString().isEmpty()){
                    Toast.makeText(ProbabilityUrSprudZaOchniVolguActivity.this,"Пожалуйста заполните данные обязательных предметов", Toast.LENGTH_SHORT).show();
                }

                if (editTextInfo.getText().toString().isEmpty()
                        && editTextEnglish.getText().toString().isEmpty() && editTextHistory.getText().toString().isEmpty()){
                    Toast.makeText(ProbabilityUrSprudZaOchniVolguActivity.this,"Пожалуйста заполните хотя бы один из предметов по выбору", Toast.LENGTH_SHORT).show();
                }

                Integer math = Integer.parseInt(editTextMath.getText().toString());
                Integer russian = Integer.parseInt(editTextRussian.getText().toString());
                Integer english=null, physic = null, himia=null, info=null;


                if (editTextInfo.getText().toString().isEmpty()){
                    info = 0;
                }else {
                    info = Integer.parseInt(editTextInfo.getText().toString());
                }

                if (editTextEnglish.getText().toString().isEmpty()){
                    english = 0;
                }else {
                    english = Integer.parseInt(editTextEnglish.getText().toString());
                }

                if (editTextHistory.getText().toString().isEmpty()){
                    himia = 0;
                }else {
                    himia = Integer.parseInt(editTextHistory.getText().toString());
                }

                probabilityNew = String.valueOf(math + russian + physic +info+ english+himia);

                showCheckResDialogVolgu();
            }
        });
    }

    private void showCheckResDialogVolgu(){
        ConstraintLayout checkVolguConstrLayout = findViewById(R.id.CheckProbabilityPMIVolgu);
        View view = LayoutInflater.from(ProbabilityUrSprudZaOchniVolguActivity.this).inflate(R.layout.check_probability_pmi, checkVolguConstrLayout);
        Button endWindow = view.findViewById(R.id.endBtnCheckPMI);
        TextView probability = view.findViewById(R.id.resultCheckVolguWithoutEkz);
        probability.setText(probabilityNew);

        AlertDialog.Builder builder = new AlertDialog.Builder(ProbabilityUrSprudZaOchniVolguActivity.this);
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
