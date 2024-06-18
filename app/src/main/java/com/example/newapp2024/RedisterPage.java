//package com.example.newapp2024;
//
//import androidx.annotation.NonNull;
//import androidx.appcompat.app.AppCompatActivity;
//
//import android.os.Bundle;
//import android.text.TextUtils;
//import android.view.View;
//import android.widget.Button;
//import android.widget.Toast;
//
//import com.google.android.gms.tasks.OnCompleteListener;
//import com.google.android.gms.tasks.Task;
//import com.google.android.material.textfield.TextInputEditText;
//import com.google.firebase.auth.AuthResult;
//import com.google.firebase.auth.FirebaseAuth;
//import com.google.firebase.auth.FirebaseUser;
//
//import java.util.HashMap;
//
//public class RedisterPage extends AppCompatActivity {
//    FirebaseAuth mAuth;
//    TextInputEditText editTextUsername, editTextPassword;
//    Button regBtn;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_redister_page);
//
//        mAuth = FirebaseAuth.getInstance();
//        editTextUsername = findViewById(R.id.username);
//        editTextPassword = findViewById(R.id.password);
//
//        regBtn = findViewById(R.id.regButton);
//
//        regBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String username, password;
//
//                username = String.valueOf(editTextUsername.getText());
//                password = String.valueOf(editTextPassword.getText());
//
//                if(username.isEmpty() || password.isEmpty()){
//                    Toast.makeText(getApplicationContext(), "Необходимо заполнить данные", Toast.LENGTH_SHORT).show();
//                }else {
//                    FirebaseAuth.getInstance().createUserWithEmailAndPassword(username, password)
//                            .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
//                                @Override
//                                public void onComplete(@NonNull Task<AuthResult> task) {
//                                    if(task.isSuccessful()){
//                                        HashMap<String, String> userInfo = new HashMap<>();
//                                        userInfo.put("username", username);
//                                    }
//                                }
//                            });
//                }
//
////                if (TextUtils.isEmpty(username)){
////                    Toast.makeText(RedisterPage.this, "Введите логин", Toast.LENGTH_SHORT).show();
////                }
////
////                if (TextUtils.isEmpty(password)){
////                    Toast.makeText(RedisterPage.this, "Введите пароль", Toast.LENGTH_SHORT).show();
////                }
//
//                mAuth.createUserWithEmailAndPassword(username, password)
//                        .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
//                            @Override
//                            public void onComplete(@NonNull Task<AuthResult> task) {
//                                if (task.isSuccessful()) {
//                                    FirebaseUser user = mAuth.getCurrentUser();
//                                } else {
//                                    Toast.makeText(RedisterPage.this, "Authentication failed.",
//                                            Toast.LENGTH_SHORT).show();
//                                }
//                            }
//                        });
//
//            }
//        });
//
//    }
//}