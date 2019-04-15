package com.example.firebase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class Credit extends AppCompatActivity {

    EditText ed1, ed2;
    ImageButton ib;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credit);

        ed1 = (EditText)findViewById(R.id.editTextcredit);
        ed2 = (EditText)findViewById(R.id.editTextcreditcvv);
        ib = (ImageButton)findViewById(R.id.imageButtoncredit);

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
