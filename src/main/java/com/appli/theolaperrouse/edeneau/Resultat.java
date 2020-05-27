package com.appli.theolaperrouse.edeneau;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Resultat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultat);

        final double tlongueur = getIntent().getDoubleExtra("longueur", 1);
        final double tlargeur = getIntent().getDoubleExtra("largeur", 1);


        double tmp = tlongueur * 100;
        int longueur = (int) tmp;
        tmp = tlargeur * 100;
        int largeur = (int) tmp;

        final boolean volets = getIntent().getBooleanExtra("volets", false);

        final int []nbreBanchesLong = CalculBanches.NbreBanches(longueur,volets);
        final int []nbreBanchesLarg = CalculBanches.NbreBanches(largeur,false);
        final int []nbreBanchesTot = new int [4];

        TextView Title = findViewById(R.id.title);
        TextView TextInterieur = findViewById(R.id.TextInterieur);
        TextView TextExterieur = findViewById(R.id.TextExterieur);
        TextView TextTot = findViewById(R.id.TextTot);

        final Button plan = findViewById(R.id.plan);

        double bet;

        int nbrePoteauxInt = 4,nbrePoteauxExt = 4;

        final String titre, resultatLi, resultatli,resultatLe,resultatle,bett,textInterieur, resultatTot;


        if(volets) {
            titre = "Résultat pour une piscine avec volets de " + tlongueur + " x " + tlargeur + " mètres";
            int nbreBanchesText06 = nbreBanchesLong[2]+1;
            int nbreBanchesText035 = nbreBanchesLong[0]+3;
            resultatLe = "Longueur Extérieure :" +
                    "\n\nBanches 1 M : " + nbreBanchesLong[3]
                    + "\nBanches 0,6 M : " + nbreBanchesText06
                    + "\nBanches 0,5 M : " + nbreBanchesLong[1]
                    + "\nBanches 0,35 M : " + nbreBanchesText035;
            nbrePoteauxInt = 8;
            bet = ((tlongueur + 0.3) * (tlargeur + 0.3) * 1.5) + (tlargeur * 1.2 * 0.2) - (tlongueur * tlargeur * 1.5);
            nbreBanchesTot[0] = nbreBanchesLong[0] * 4 + nbreBanchesLarg[0] * 6 + 12;
            nbreBanchesTot[1] = nbreBanchesLong[1] * 4 + nbreBanchesLarg[1] * 6;
            nbreBanchesTot[2] = nbreBanchesLong[2] * 4 + nbreBanchesLarg[2] * 6 + 2;
            nbreBanchesTot[3] = nbreBanchesLong[3] * 4 + nbreBanchesLarg[3] * 6;
        }
        else{
            int nbreBanchesText035 = nbreBanchesLong[0]+2;
            resultatLe = "Longueur Extérieure :" +
                    "\n\nBanches 1 M : " + nbreBanchesLong[3]
                    + "\nBanches 0,6 M : " + nbreBanchesLong[2]
                    + "\nBanches 0,5 M : " + nbreBanchesLong[1]
                    + "\nBanches 0,35 M : " + nbreBanchesText035;

            titre ="Résultat pour une piscine de " + tlongueur + " x "+ tlargeur + " mètres";
            bet = ((tlongueur + 0.3) * (tlargeur + 0.3) * 1.5) - (tlongueur * tlargeur * 1.5);
            nbreBanchesTot[0] = nbreBanchesLong[0] * 4 + nbreBanchesLarg[0] * 4 + 8;
            nbreBanchesTot[1] = nbreBanchesLong[1] * 4 + nbreBanchesLarg[1] * 4;
            nbreBanchesTot[2] = nbreBanchesLong[2] * 4 + nbreBanchesLarg[2] * 4;
            nbreBanchesTot[3] = nbreBanchesLong[3] * 4 + nbreBanchesLarg[3] * 4;
        }

        resultatLi = "Longueur Intérieure :" +
                "\n\nBanches 1 M : " + nbreBanchesLong[3]
                + "\nBanches 0,6 M : " + nbreBanchesLong[2]
                + "\nBanches 0,5 M : " + nbreBanchesLong[1]
                + "\nBanches 0,35 M : " + nbreBanchesLong[0];

        resultatli = "Largeur Intérieure :" +
                "\n\nBanches 1 M : " + nbreBanchesLarg[3]
                + "\nBanches 0,6 M : " + nbreBanchesLarg[2]
                + "\nBanches 0,5 M : " + nbreBanchesLarg[1]
                + "\nBanches 0,35 M : " + nbreBanchesLarg[0];



        int nbreBanchesText035 = nbreBanchesLarg[0]+2;
        resultatle = "Largeur Extérieure :" +
                "\n\nBanches 1 M : " + nbreBanchesLarg[3]
                + "\nBanches 0,6 M : " + nbreBanchesLarg[2]
                + "\nBanches 0,5 M : " + nbreBanchesLarg[1]
                + "\nBanches 0,35 M : " + nbreBanchesText035;




        NumberFormat nf = new DecimalFormat("0.##");

        resultatTot = "Total Banches 1M : " + nbreBanchesTot[3]
                +"\nTotal Banches 0,6M : " + nbreBanchesTot[2]
                +"\nTotal Banches 0,5M : " + nbreBanchesTot[1]
                +"\nTotal Banches 0,35M : " + nbreBanchesTot[0];

        bett = "Poteaux intérieurs : "+ nbrePoteauxInt
                + "\nPoteaux extérieurs : " + nbrePoteauxExt
                + "\nBéton nécessaire " + nf.format(bet) + " m3";

        textInterieur = resultatLi + "\n\n" + resultatli;
        String textTot = resultatTot +"\n\n"+ bett;
        String textExterieur = resultatLe +"\n\n"+ resultatle;

        TextInterieur.setText(textInterieur);
        TextExterieur.setText(textExterieur);
        TextTot.setText(textTot);
        Title.setText(titre);

        plan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Envoi des données vers le plan
                Intent Plan = new Intent(getApplicationContext(), Plan.class);
                Plan.putExtra("boolVolets",volets);

                Plan.putExtra("titre",titre);
                final String nomClient = getIntent().getStringExtra("nomClient");
                Plan.putExtra("nomClient", nomClient);
                Plan.putExtra("nbreBanchesLong",nbreBanchesLong);
                Plan.putExtra("nbreBanchesLarg",nbreBanchesLarg);
                Plan.putExtra("nbreBanchesTot",nbreBanchesTot);

                startActivity(Plan);
            }
        });

    }
}
