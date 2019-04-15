package com.example.firebase;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class Debit extends AppCompatActivity {

    EditText ed1, ed2;
    ImageButton ib;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_debit);

        ed1 = (EditText)findViewById(R.id.editTextdebit);
        ed2 = (EditText)findViewById(R.id.editTextcvv);
        ib = (ImageButton)findViewById(R.id.imageButtondebit);

        ib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(TextUtils.isEmpty(ed1.getText().toString()) || TextUtils.isEmpty(ed2.getText().toString()))
                    Toast.makeText(getApplicationContext(), "Field cannot be empty", Toast.LENGTH_LONG).show();
                else{
                    startActivity(new Intent(getApplicationContext(), Thanks.class));
                    finish();
                }
            }
        });
    }
}
