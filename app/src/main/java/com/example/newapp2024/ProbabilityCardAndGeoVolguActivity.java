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

public class ProbabilityCardAndGeoVolguActivity extends AppCompatActivity {

    EditText editTextRussian;
    EditText editTextMath;
    EditText editTextEnglish;
    EditText editTextGeo;
    EditText editTextBio;
    EditText editTextInfo;
    Button calcProb;
    String probabilityNew;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_probability_card_and_geo_volgu);

        editTextEnglish = findViewById(R.id.editTextTEnglish);
        editTextGeo = findViewById(R.id.editTextGeo);
        editTextInfo = findViewById(R.id.editTextInfo);
        editTextMath = findViewById(R.id.editTextTMathNew);
        editTextRussian = findViewById(R.id.editTextRussian);
        editTextBio = findViewById(R.id.editTextBio);



        calcProb = findViewById(R.id.calcProb);
        calcProb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editTextGeo.getText().toString().isEmpty() && editTextRussian.getText().toString().isEmpty()){
                    Toast.makeText(ProbabilityCardAndGeoVolguActivity.this,"Пожалуйста заполните данные обязательных предметов", Toast.LENGTH_SHORT).show();
                }

                if (editTextMath.getText().toString().isEmpty() && editTextInfo.getText().toString().isEmpty()
                        && editTextEnglish.getText().toString().isEmpty() && editTextBio.getText().toString().isEmpty()){
                    Toast.makeText(ProbabilityCardAndGeoVolguActivity.this,"Пожалуйста заполните хотя бы один из предметов по выбору", Toast.LENGTH_SHORT).show();
                }

                Integer geo = Integer.parseInt(editTextGeo.getText().toString());
                Integer russian = Integer.parseInt(editTextRussian.getText().toString());
                Integer english=null, bio = null, math=null, info=null;

                if (editTextBio.getText().toString().isEmpty()){
                    bio = 0;
                } else {
                    bio = Integer.parseInt(editTextBio.getText().toString());
                }

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

                if (editTextMath.getText().toString().isEmpty()){
                    math = 0;
                }else {
                    math = Integer.parseInt(editTextMath.getText().toString());
                }

                probabilityNew = String.valueOf(math + russian + bio +info+ english+geo);

                showCheckResDialogVolgu();
            }
        });
    }

    private void showCheckResDialogVolgu(){
        ConstraintLayout checkVolguConstrLayout = findViewById(R.id.CheckProbabilityPMIVolgu);
        View view = LayoutInflater.from(ProbabilityCardAndGeoVolguActivity.this).inflate(R.layout.check_probability_pmi, checkVolguConstrLayout);
        Button endWindow = view.findViewById(R.id.endBtnCheckPMI);
        TextView probability = view.findViewById(R.id.resultCheckVolguWithoutEkz);
        probability.setText(probabilityNew);

        AlertDialog.Builder builder = new AlertDialog.Builder(ProbabilityCardAndGeoVolguActivity.this);
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