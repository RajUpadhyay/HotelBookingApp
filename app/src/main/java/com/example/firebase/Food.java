package com.example.firebase;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.Spinner;

import java.util.ArrayList;

public class Food extends AppCompatActivity {

    Spinner spinner;
    ImageButton ib;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);

        final Spinner spinner = findViewById(R.id.spinner);
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("No food");
        arrayList.add("Only Breakfast");
        arrayList.add("Only Lunch");
        arrayList.add("Only Dinner");
        arrayList.add("Breakfast + Lunch");
        arrayList.add("Breakfast + Dinner");
        arrayList.add("Lunch + Dinner");
        arrayList.add("Breakfast + Lunch + Dinner");
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, arrayList);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(arrayAdapter);

        ib = (ImageButton)findViewById(R.id.imageButtonfood);

        ib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    startActivity(new Intent(getApplicationContext(), DateSelection.class));
                    finish();
            }
        });
    }
}
