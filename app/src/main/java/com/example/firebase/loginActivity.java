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
import com.google.firebase.auth.FirebaseUser;

public class loginActivity extends AppCompatActivity implements View.OnClickListener{

    Button loginbutton;
    ProgressBar loginProgress;
    EditText mail;
    EditText password;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mail = (EditText) findViewById(R.id.login_mail);
        password = (EditText) findViewById(R.id.loginpassword);
        loginbutton = findViewById(R.id.loginbutton);
        loginProgress = findViewById(R.id.loginprogress);
        loginProgress.setVisibility(View.INVISIBLE );

        findViewById(R.id.signup).setOnClickListener(this);

        mAuth = FirebaseAuth.getInstance();

        loginbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                userLogin();
                /* loginProgress.setVisibility(View.VISIBLE);
                 loginbutton.setVisibility(View.INVISIBLE);

                 Intent myintent = new Intent(view.getContext(), MainActivity.class );
                 startActivity(myintent);
                 finish();*/
            }
        });
    }

    @Override
    public void onStart() {
        super.onStart();
        // Check if user is signed in (non-null) and update UI accordingly.
        FirebaseUser currentUser = mAuth.getCurrentUser();
        updateUI(currentUser);
    }

    private void updateUI(FirebaseUser currentUser) {
    }

    private void userLogin() {

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

        mAuth.signInWithEmailAndPassword(email, pass).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                loginProgress.setVisibility(View.INVISIBLE );
                if (task.isSuccessful()){
                    Toast.makeText(getApplicationContext(), "Logged IN", Toast.LENGTH_LONG).show();
                    startActivity(new Intent(getApplicationContext(), MainActivity.class));
                    finish();
                    FirebaseUser user = mAuth.getCurrentUser();
                    updateUI(user);
                }
                else{
                    Toast.makeText(getApplicationContext(), task.getException().getMessage(), Toast.LENGTH_LONG).show();
                    loginbutton.setVisibility(View.VISIBLE);
                }
            }
        });
    }


    @Override
    public void onClick(View view) {
        switch(view.getId()) {
            case R.id.signup: {
                startActivity(new Intent(this, RegisterActivity.class));
                finish();
            }
            break;
        }
    }
}
