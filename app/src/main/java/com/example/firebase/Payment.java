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

public class Payment extends AppCompatActivity {

    Spinner spinner;
    ImageButton ib;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        final Spinner spinner = findViewById(R.id.spinner);
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Choose Payment Mode");
        arrayList.add("1. Debit Card");
        arrayList.add("2. Credit Card");
        arrayList.add("3. UPI");
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, arrayList);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(arrayAdapter);

        ib = (ImageButton)findViewById(R.id.imageButtonpaymentmode);

        ib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (spinner.getSelectedItem() != "Choose Payment Mode") {
                    if (spinner.getSelectedItem() == "1. Debit Card")
                        startActivity(new Intent(getApplicationContext(), Debit.class));
                    else if(spinner.getSelectedItem() == "2. Credit Card")
                        startActivity(new Intent(getApplicationContext(), Credit.class));
                    else
                        startActivity(new Intent(getApplicationContext(), UPI.class));
                }
                else
                    Toast.makeText(getApplicationContext(), "Please choose a valid option", Toast.LENGTH_LONG).show();
            }
        });
    }
}
