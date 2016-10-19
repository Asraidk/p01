package com.example.portatil.p01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class ActivitatPrincipal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activitat_principal);

        Button boton1 = (Button)findViewById(R.id.button);
        final EditText introduirNom = (EditText)findViewById(R.id.editText);
        final EditText introduirCognom = (EditText)findViewById(R.id.editText2);
        final EditText introduirEdat = (EditText)findViewById(R.id.editText3);
        final CheckBox tic = (CheckBox)findViewById(R.id.checkBox);


        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Bundle tren = new Bundle();

                Boolean marcat = tic.isChecked();



                tren.putString("Nom",introduirNom.getText().toString());
                tren.putString("Cognom",introduirCognom.getText().toString());
                tren.putString("Edat",introduirEdat.getText().toString());

                if(marcat==true){
                    tren.putString("marcat","Permet enviar les dades");
                }
                else{
                    tren.putString("marcat","No permet enviar les dades");
                }

                Intent parada =new Intent(ActivitatPrincipal.this,ActivitatSecundaria.class);
                parada.putExtras(tren);
                startActivity(parada);


            }
        });
    }
}
