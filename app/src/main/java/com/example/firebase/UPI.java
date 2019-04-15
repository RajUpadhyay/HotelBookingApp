package com.example.firebase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class UPI extends AppCompatActivity {

    EditText ed;
    ImageButton ib;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upi);

        ed = (EditText)findViewById(R.id.editnameupi);
        ib = (ImageButton)findViewById(R.id.imageButtonupi);

        ib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(TextUtils.isEmpty(ed.getText().toString()))
                    Toast.makeText(getApplicationContext(), "Field cannot be empty", Toast.LENGTH_LONG).show();
                else {
                    startActivity(new Intent(getApplicationContext(), Thanks.class));
                    finish();
                }
            }
        });

    }
}
