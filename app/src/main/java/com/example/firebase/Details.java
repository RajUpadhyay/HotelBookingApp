package com.example.firebase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class Details extends AppCompatActivity {

    ImageButton ib;
    EditText ed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        ib = (ImageButton)findViewById(R.id.imageButton);
        ed = (EditText)findViewById(R.id.editname);

        ib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(TextUtils.isEmpty(ed.getText().toString()))
                    Toast.makeText(getApplicationContext(), "Enter your Name!", Toast.LENGTH_LONG).show();
                else
                    startActivity(new Intent(getApplicationContext(), NoofRooms.class));
            }
        });

    }
}
