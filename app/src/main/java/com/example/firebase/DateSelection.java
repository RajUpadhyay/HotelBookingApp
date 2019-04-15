package com.example.firebase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class DateSelection extends AppCompatActivity {

    ImageButton ib;
    Spinner s1, s2, s3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_selection);

        final Spinner s1 = findViewById(R.id.spinner1);
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("-Select Date-");
        for(int i=1; i<=31; i++)
            arrayList.add(i+"");
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, arrayList);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s1.setAdapter(arrayAdapter);

        final Spinner s2 = findViewById(R.id.spinner2);
        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("-Select Month-");
        arrayList2.add("Jan");
        arrayList2.add("Feb");
        arrayList2.add("Mar");
        arrayList2.add("Apr");
        arrayList2.add("May");
        arrayList2.add("Jun");
        arrayList2.add("Jul");
        arrayList2.add("Aug");
        arrayList2.add("Sep");
        arrayList2.add("Oct");
        arrayList2.add("Nov");
        arrayList2.add("Dec");
        ArrayAdapter<String> arrayAdapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, arrayList2);
        arrayAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s2.setAdapter(arrayAdapter2);

        final Spinner s3 = findViewById(R.id.spinner3);
        ArrayList<String> arrayList3 = new ArrayList<>();
        arrayList3.add("-Select Year-");
        for(int i=2019; i<=2020; i++)
            arrayList3.add(i+"");
        ArrayAdapter<String> arrayAdapter3 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, arrayList3);
        arrayAdapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s3.setAdapter(arrayAdapter3);

        ib = (ImageButton)findViewById(R.id.imageButtonrooms);

        ib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (s1.getSelectedItem() != "-Select Date-" && s2.getSelectedItem() != "-Select Month-" && s3.getSelectedItem() != "-Select Year-")
                    startActivity(new Intent(getApplicationContext(), Payment.class));
                else
                    Toast.makeText(getApplicationContext(), "Please choose a valid option", Toast.LENGTH_LONG).show();

            }
        });

    }
}
