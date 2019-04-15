package com.example.firebase;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class NoofRooms extends AppCompatActivity {

    Spinner spinner;
    ImageButton ib;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_noof_rooms);

        final Spinner spinner = findViewById(R.id.spinner);
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Max rooms per booking is 4");
        arrayList.add("1");
        arrayList.add("2");
        arrayList.add("3");
        arrayList.add("4");
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, arrayList);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(arrayAdapter);

        ib = (ImageButton)findViewById(R.id.imageButtonrooms);

            ib.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (spinner.getSelectedItem() != "Max rooms per booking is 4")
                        startActivity(new Intent(getApplicationContext(), Food.class));
                    else
                        Toast.makeText(getApplicationContext(), "Please choose a valid option", Toast.LENGTH_LONG).show();
                }
            });
    }
}
