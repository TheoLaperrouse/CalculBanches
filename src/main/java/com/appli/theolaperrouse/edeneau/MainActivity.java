package com.appli.theolaperrouse.edeneau;

import android.Manifest;
import android.app.Application;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.design.widget.Snackbar;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

import static java.security.AccessController.getContext;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText longueur = findViewById(R.id.longueur);
        final EditText largeur = findViewById(R.id.largeur);
        final EditText nomClient = findViewById(R.id.nomClient);
        final Switch volets = findViewById(R.id.Volets);
        final View v = new View(getApplicationContext());


        Button valider = findViewById(R.id.butValid);


        valider.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(longueur.getText().toString().matches("") || largeur.getText().toString().matches("")){
                    Toast.makeText(getApplicationContext(), "Veuillez renseigner des mesures!", Toast.LENGTH_SHORT).show();
                }
                else if((Double.parseDouble(longueur.getText().toString())<3) || (Double.parseDouble(largeur.getText().toString())<3)){
                    Toast.makeText(getApplicationContext(), "La longueur et la largeur de la piscine doivent faire au minimum 3 mètres", Toast.LENGTH_SHORT).show();
                }
                else if((Double.parseDouble(longueur.getText().toString())>50) || (Double.parseDouble(largeur.getText().toString())>50)){
                    Toast.makeText(getApplicationContext(), "La longueur et la largeur de la piscine doivent faire au maximium 50 mètres", Toast.LENGTH_SHORT).show();
                }
                else {
                    double tlongueur = Double.valueOf(longueur.getText().toString());
                    double tlargeur = Double.valueOf(largeur.getText().toString());
                    String NomClient = nomClient.getText().toString();

                    Intent Resultat = new Intent(getApplicationContext(), Resultat.class);
                    Resultat.putExtra("nomClient", NomClient);
                    Resultat.putExtra("longueur", tlongueur);
                    Resultat.putExtra("largeur", tlargeur);
                    Resultat.putExtra("volets", volets.isChecked());
                    startActivity(Resultat);
                }
            }
        });
    }
}
