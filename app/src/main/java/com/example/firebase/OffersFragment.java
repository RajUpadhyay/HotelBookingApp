package com.example.firebase;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class OffersFragment extends Fragment{
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_offers, container, false);

        CardView cardView1 = view.findViewById(R.id.dis1);
        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(), Details.class));
            }
        });

        CardView cardView2 = view.findViewById(R.id.dis2);
        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(), Details.class));
            }
        });

        CardView cardView3 = view.findViewById(R.id.dis3);
        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(), Details.class));
            }
        });

        CardView cardView4 = view.findViewById(R.id.dis4);
        cardView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(), Details.class));
            }
        });

        CardView cardView5 = view.findViewById(R.id.dis5);
        cardView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(), Details.class));
            }
        });

        CardView cardView6 = view.findViewById(R.id.dis6);
        cardView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(), Details.class));
            }
        });

        CardView cardView7 = view.findViewById(R.id.dis7);
        cardView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(), Details.class));
            }
        });

        CardView cardView8 = view.findViewById(R.id.dis8);

        cardView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(), Details.class));
            }
        });

        CardView cardView9 = view.findViewById(R.id.dis9);

        cardView9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(), Details.class));
            }
        });

        CardView cardView10 = view.findViewById(R.id.dis10);

        cardView10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(), Details.class));
            }
        });

        return view;
    }
}