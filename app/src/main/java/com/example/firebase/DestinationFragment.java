package com.example.firebase;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;

public class DestinationFragment extends Fragment{

    ImageView i2, i3, i4;
    EditText Manali, Manalidesc, Goa, Goadesc, Ladakh, Ladakhdesc;
    @SuppressLint("WrongViewCast")
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_destinations, container, false);

        i2 = (ImageView)view.findViewById(R.id.imageView2);
        i3 = (ImageView)view.findViewById(R.id.imageView3);
        i4 = (ImageView)view.findViewById(R.id.imageView4);

        //Manali = (EditText)view.findViewById(R.id.manali);
        i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(), ManaliHotels.class));
            }
        });

        i3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(), GoaHotels.class));
            }
        });

        i4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(), LadakhHotels.class));
            }
        });

        return  view;
    }
}

