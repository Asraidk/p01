package com.example.portatil.p01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ActivitatSecundaria extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activitat_secundaria);

        TextView visualitzaNom=(TextView)findViewById(R.id.textView);
        TextView visualitzaCognom=(TextView)findViewById(R.id.textView6);
        TextView visualitzaEdat=(TextView)findViewById(R.id.textView7);
        TextView visualitzaPublicacio=(TextView)findViewById(R.id.textView8);


        Bundle tren = getIntent().getExtras();

        visualitzaNom.setText(tren.getString("Nom"));
        visualitzaCognom.setText(tren.getString("Cognom"));
        visualitzaEdat.setText(tren.getString("Edat"));
        visualitzaPublicacio.setText(tren.getString("marcat"));
    }
}
