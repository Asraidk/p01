package com.example.portatil.p01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class ActivitatSecundaria extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activitat_secundaria);
        //instanciem el objectes que rebran la informacio del bundle que volem mostrar
        TextView visualitzaNom=(TextView)findViewById(R.id.textView);
        TextView visualitzaCognom=(TextView)findViewById(R.id.textView6);
        TextView visualitzaEdat=(TextView)findViewById(R.id.textView7);
        //fem que el bundle posi la innfo
        Bundle tren = getIntent().getExtras();
        //toast ni p idea como va (repasar)
        Toast toast= Toast.makeText(getApplicationContext(),tren.getString("marcat"), Toast.LENGTH_LONG);
        //fem que el objecte agafi el bundle que li volem assignar
        visualitzaNom.setText(tren.getString("Nom"));
        visualitzaCognom.setText(tren.getString("Cognom"));
        visualitzaEdat.setText(tren.getString("Edat"));
        //per mostrar
        toast.show();
    }
}
