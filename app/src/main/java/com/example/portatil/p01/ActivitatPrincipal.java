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
        //instanciem
        //Un boto per poder interectuar de un layout al altre
        Button boton1 = (Button)findViewById(R.id.button);
        // elements que necesitarem per dur a terme el pas de un activiti a l'altre
        final EditText introduirNom = (EditText)findViewById(R.id.editText);
        final EditText introduirCognom = (EditText)findViewById(R.id.editText2);
        final EditText introduirEdat = (EditText)findViewById(R.id.editText3);
        //un "boto" que podra marcar l'usuari
        final CheckBox tic = (CheckBox)findViewById(R.id.checkBox);

        //si fa click en el boto que em creat
        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //crem un bundle--> es el nostre transportador
                Bundle tren = new Bundle();
                //variable per controlar si el estat del check box
                Boolean marcat = tic.isChecked();
                //fem que el bundle que em creat agafi les dades dels objectas relacionats en el
                //layout vinculat previament mintjançant la R i la id
                tren.putString("Nom",introduirNom.getText().toString());
                tren.putString("Cognom",introduirCognom.getText().toString());
                tren.putString("Edat",introduirEdat.getText().toString());
                //Condicio per veure quin  misatge enviarem si el chex box anomenat tic esta marcat
                if(marcat==true){
                    tren.putString("marcat","Permet enviar les dades");
                }
                else{
                    tren.putString("marcat","No permet enviar les dades");
                }
                //cream un intent que sera el que ens permet fer el tunel entre 1 i altre activity
                Intent tunel =new Intent(ActivitatPrincipal.this,ActivitatSecundaria.class);
                //afeguim al intent el que em carregat al bundle
                tunel.putExtras(tren);
                //iniciem l'activyti
                startActivity(tunel);
            }
        });
    }
}
