package com.example.firebase;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthUserCollisionException;
import com.google.firebase.auth.FirebaseUser;

public class RegisterActivity extends AppCompatActivity implements View.OnClickListener{

    EditText mail;
    EditText password;
    Button loginbutton;
    ProgressBar loginProgress;

    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        mail = (EditText) findViewById(R.id.login_mail);
        password = (EditText) findViewById(R.id.login_password);
        loginbutton = (Button) findViewById(R.id.loginbutton);

        loginProgress = (ProgressBar) findViewById(R.id.loginprogress);


//        findViewById(R.id.signup).setOnClickListener(this);

        loginbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()){
                    case R.id.loginbutton:{
                        registerUser();
                    }
                    break;
                }
            }
        });


            mAuth =FirebaseAuth.getInstance();
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()) {
            case R.id.signup: {

            }
            break;

        }
    }

    private void registerUser() {
        String email = mail.getText().toString().trim();
        String pass = password.getText().toString().trim();

          if (email.isEmpty()) {
            Toast.makeText(getApplicationContext(), "Enter Email", Toast.LENGTH_LONG).show();
            mail.requestFocus();
            return;
        }
        if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            Toast.makeText(getApplicationContext(), "Enter Valid Email", Toast.LENGTH_LONG).show();
            mail.requestFocus();
            return;
        }
        if (pass.isEmpty()) {
            Toast.makeText(getApplicationContext(), "Enter Password", Toast.LENGTH_LONG).show();
            mail.requestFocus();
            return;
        }
        if (pass.length() < 6) {
            Toast.makeText(getApplicationContext(), "Minimum length is 6", Toast.LENGTH_LONG).show();
            mail.requestFocus();
            return;
        }
        loginProgress.setVisibility(View.VISIBLE);
        loginbutton.setVisibility(View.INVISIBLE);
        mAuth.createUserWithEmailAndPassword(email, pass).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                loginProgress.setVisibility(View.INVISIBLE );
                if (task.isSuccessful()) {
                    Toast.makeText(getApplicationContext(), "User Registered Successfully!", Toast.LENGTH_LONG).show();
                    FirebaseUser user = mAuth.getCurrentUser();
                    updateUI(user);
                    startActivity(new Intent(getApplicationContext(), loginActivity.class));
                    finish();
                }
                else
                {
                    if(task.getException() instanceof FirebaseAuthUserCollisionException){
                        Toast.makeText(getApplicationContext(), "Already Registered!", Toast.LENGTH_LONG).show();
                        startActivity(new Intent(getApplicationContext(), loginActivity.class));
                        finish();
                    }else
                    {
                        Toast.makeText(getApplicationContext(), task.getException().getMessage(), Toast.LENGTH_LONG).show();
                        loginbutton.setVisibility(View.VISIBLE);

                    }
                }
            }

            private void updateUI(FirebaseUser user) {
            }
        });

    }

}