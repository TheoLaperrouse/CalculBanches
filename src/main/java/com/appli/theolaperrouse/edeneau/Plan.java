package com.appli.theolaperrouse.edeneau;

import android.Manifest;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class Plan extends AppCompatActivity {

    ImageView plan;
    ImageView legendeImage;
    public Bitmap b;
    private void askForPermission() {
        requestPermissions(new String[] { Manifest.permission.WRITE_EXTERNAL_STORAGE}, 2);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plan);

        plan = findViewById(R.id.ImagePlan);
        legendeImage = findViewById(R.id.legende);

        Button retour = findViewById(R.id.retour);
        final String nomClient = getIntent().getStringExtra("nomClient");

        TextView Titre = findViewById(R.id.Titre);
        boolean boolVolets = getIntent().getBooleanExtra("boolVolets", false);

        final Bitmap Leg = Bitmap.createBitmap(670, 100, Bitmap.Config.ARGB_8888);

        String titre = getIntent().getStringExtra("titre");

        int[] nbreBanchesLong = getIntent().getIntArrayExtra("nbreBanchesLong");
        int[] nbreBanchesLarg = getIntent().getIntArrayExtra("nbreBanchesLarg");
        int[] nbreBanchesTot = getIntent().getIntArrayExtra("nbreBanchesTot");



        int longBit = 0;
        int largBit = 0;
        int longueur = 52 + nbreBanchesLong[3] * 80 + nbreBanchesLong[2] * 48 + nbreBanchesLong[1] * 40 + nbreBanchesLong[0] * 28;
        int largeur = 52 + nbreBanchesLarg[3] * 80 + nbreBanchesLarg[2] * 48 + nbreBanchesLarg[1] * 40 + nbreBanchesLarg[0] * 28;

        if (boolVolets) {
            longBit = (longueur + 138);
            longueur = 128 + nbreBanchesLong[3] * 80 + nbreBanchesLong[2] * 48 + nbreBanchesLong[1] * 40 + nbreBanchesLong[0] * 28;

        } else {
            longBit = (longueur + 52);

        }

        largBit = (largeur + 52);
        b = Bitmap.createBitmap(longBit, largBit, Bitmap.Config.ARGB_8888);
        Canvas c = new Canvas(b);
        Canvas Legende = new Canvas(Leg);

        DessinPlan.dessinLongueur(c,boolVolets,largeur,nbreBanchesLong);
        DessinPlan.dessinLargeur(c,boolVolets,longueur,nbreBanchesLarg);
        DessinPlan.dessinLeg(Legende, nbreBanchesTot);

        Titre.setText(titre);
        plan.setImageBitmap(b);
        legendeImage.setImageBitmap(Leg);

        retour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bitmap bitmapConcat = DessinPlan.mergeBitmap(b,Leg);
                if (ActivityCompat.checkSelfPermission(getApplicationContext(), Manifest.permission.WRITE_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED) {
                   askForPermission();
                }
                else{
                    if(DessinPlan.createPdf(bitmapConcat,nomClient)){
                        Toast.makeText(getApplicationContext(), "Document bien téléchargé", Toast.LENGTH_LONG).show();
                    }
                    else{
                        Toast.makeText(getApplicationContext(), "Impossible de télécharger, voir si les autorisations des stockage sont activées" , Toast.LENGTH_LONG).show();
                    }
                }
            }
        });
    }
}

