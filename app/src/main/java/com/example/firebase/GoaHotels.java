package com.example.firebase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GoaHotels extends AppCompatActivity {

    Button card1, card2, card3, card4, card5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goa_hotels);

            card1 = (Button) findViewById(R.id.b1);
            card2 = (Button) findViewById(R.id.b2);
            card3 = (Button) findViewById(R.id.b3);
            card4 = (Button) findViewById(R.id.b4);
            card5 = (Button) findViewById(R.id.b5);

            card1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    startActivity(new Intent(getApplicationContext(), Details.class));
                }
            });

            card2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    startActivity(new Intent(getApplicationContext(), Details.class));
                }
            });

            card3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    startActivity(new Intent(getApplicationContext(), Details.class));
                }
            });

            card4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    startActivity(new Intent(getApplicationContext(), Details.class));
                }
            });

            card5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    startActivity(new Intent(getApplicationContext(), Details.class));
                }
            });
        }
    }
