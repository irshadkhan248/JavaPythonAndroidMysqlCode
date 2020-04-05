package com.example.firebaseauthentication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class signUpActivity extends AppCompatActivity {
EditText etSignUpEmailId,etSignUpPassword;
Button btnSignUpRegister;
FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        etSignUpEmailId=findViewById(R.id.etSignUpEmail);
        etSignUpPassword=findViewById(R.id.etSignUpPassword);
        btnSignUpRegister=findViewById(R.id.btnSignUpRegister);
        firebaseAuth=FirebaseAuth.getInstance();
        btnSignUpRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email= etSignUpEmailId.getText().toString();
                String password=etSignUpPassword.getText().toString();
                firebaseAuth.createUserWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {

                        if(task.isSuccessful()){
                            Intent a=new Intent(signUpActivity.this,MainActivity.class);
                            startActivity(a);
                            finish();
                        }
                        else{
                            Toast.makeText(signUpActivity.this, "Failure"+task.getException(), Toast.LENGTH_SHORT).show();

                        }
                    }
                });
            }
        });
    }
}
