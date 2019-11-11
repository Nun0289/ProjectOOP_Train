package com.example.traintable;


import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.gridlayout.widget.GridLayout;

import java.sql.SQLOutput;

public class Thaitrain extends Fragment {
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.thaitrain, container, false);
        //Set Event

        CardView infobase = view.findViewById(R.id.card);
        CardView infobase2 = view.findViewById(R.id.card_2);
        CardView infobase3 = view.findViewById(R.id.card_3);
        infobase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), WebviewActivity.class);
                Log.e("Cardview","CLICK");
                intent.putExtra("url","http://www.railway.co.th/WebDestination/#/SearchDestination/TH");
                startActivity(intent);
            }
        });
        infobase2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), WebviewActivity.class);
                Log.e("Cardview","CLICK");
                intent.putExtra("url","http://tts.railway.co.th/passenger/view.php");
                startActivity(intent);
            }
        });
        infobase3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), WebviewActivity.class);
                Log.e("Cardview","CLICK");
                intent.putExtra("url","https://www.busonlineticket.co.th/booking_th/thai-railway-train-ticket.aspx");
                startActivity(intent);
            }
        });
        return view;
    }
}
