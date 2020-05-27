package com.appli.theolaperrouse.edeneau;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.pdf.PdfDocument;
import android.os.Environment;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class DessinPlan {
    public static void dessinLongueur(Canvas c, boolean volets, int largeur, int[] nbreBanchesLong){
        Rect r = new Rect();

        Paint noir = new Paint(Paint.ANTI_ALIAS_FLAG | Paint.DITHER_FLAG);
        noir.setStyle(Paint.Style.FILL);
        noir.setColor(Color.parseColor("#000000"));

        Paint jaune1 = new Paint(Paint.ANTI_ALIAS_FLAG | Paint.DITHER_FLAG);
        jaune1.setStyle(Paint.Style.STROKE);
        jaune1.setColor(Color.parseColor("#FEAA01"));

        Paint rouge06 = new Paint(Paint.ANTI_ALIAS_FLAG | Paint.DITHER_FLAG);
        rouge06.setStyle(Paint.Style.STROKE);
        rouge06.setColor(Color.parseColor("#EF0000"));

        Paint vert05 = new Paint(Paint.ANTI_ALIAS_FLAG | Paint.DITHER_FLAG);
        vert05.setStyle(Paint.Style.STROKE);
        vert05.setColor(Color.parseColor("#169727"));

        Paint bleu035 = new Paint(Paint.ANTI_ALIAS_FLAG | Paint.DITHER_FLAG);
        bleu035.setStyle(Paint.Style.STROKE);
        bleu035.setColor(Color.parseColor("#0182F3"));

        int temp = 24;
        if(volets){
            r.set(temp, 8, temp + 28, 24);
            c.drawRect(r, bleu035);
            temp+= 28;
            r.set(temp, 8, temp + 28, 24);
            c.drawRect(r, bleu035);
            temp+= 28;
            r.set(temp, 8, temp+ 48, 24);
            c.drawRect(r, rouge06);
            temp+=48;

            for (int i = 0; i < nbreBanchesLong[3]; i++) {
                r.set(temp, 8, temp + 80, 24);
                c.drawRect(r, jaune1);
                temp = temp + 80;
            }
            for (int i = 0; i < nbreBanchesLong[2]; i++) {
                r.set(temp, 8, temp + 48, 24);
                c.drawRect(r, rouge06);
                temp = temp + 48;
            }
            for (int i = 0; i < nbreBanchesLong[1]; i++) {
                r.set(temp, 8, temp + 40, 24);
                c.drawRect(r, vert05);
                temp = temp + 40;
            }
            for (int i = 0; i < nbreBanchesLong[0]; i++) {
                r.set(temp, 8, temp + 28, 24);
                c.drawRect(r, bleu035);
                temp = temp + 28;
            }
            r.set(temp, 8, temp + 28, 24);
            c.drawRect(r, bleu035);

            temp = 52;

            r.set(temp, 52, temp + 28, 36);
            c.drawRect(r, bleu035);
            temp+= 76;

            for (int i = 0; i < nbreBanchesLong[3]; i++) {
                r.set(temp, 52, temp + 80, 36);
                c.drawRect(r, jaune1);
                temp = temp + 80;
            }
            for (int i = 0; i < nbreBanchesLong[2]; i++) {
                r.set(temp, 52, temp + 48, 36);
                c.drawRect(r, rouge06);
                temp = temp + 48;
            }
            for (int i = 0; i < nbreBanchesLong[1]; i++) {
                r.set(temp, 52, temp + 40, 36);
                c.drawRect(r, vert05);
                temp = temp + 40;
            }
            for (int i = 0; i < nbreBanchesLong[0]; i++) {
                r.set(temp, 52, temp + 28, 36);
                c.drawRect(r, bleu035);
                temp = temp + 28;
            }



            temp = 52;
            r.set(temp, largeur, temp + 28, largeur+16);
            c.drawRect(r, bleu035);
            temp+= 76;

            for (int i = 0; i < nbreBanchesLong[3]; i++) {
                r.set(temp, largeur, temp + 80, largeur+16);
                c.drawRect(r, jaune1);
                temp = temp + 80;
            }
            for (int i = 0; i < nbreBanchesLong[2]; i++) {
                r.set(temp, largeur, temp + 48, largeur+16);
                c.drawRect(r, rouge06);
                temp = temp + 48;
            }
            for (int i = 0; i < nbreBanchesLong[1]; i++) {
                r.set(temp, largeur, temp + 40, largeur+16);
                c.drawRect(r, vert05);
                temp = temp + 40;
            }
            for (int i = 0; i < nbreBanchesLong[0]; i++) {
                r.set(temp, largeur, temp + 28, largeur+16);
                c.drawRect(r, bleu035);
                temp = temp + 28;
            }

            temp=24;
            r.set(temp, largeur+28, temp + 28, largeur+44);
            c.drawRect(r, bleu035);
            temp+= 28;
            r.set(temp, largeur+28, temp + 28, largeur+44);
            c.drawRect(r, bleu035);
            temp+= 28;
            r.set(temp, largeur+28, temp+ 48, largeur+44);
            c.drawRect(r, rouge06);
            temp+=48;

            for (int i = 0; i < nbreBanchesLong[3]; i++) {
                r.set(temp, largeur+28, temp + 80, largeur+44);
                c.drawRect(r, jaune1);
                temp = temp + 80;
            }
            for (int i = 0; i < nbreBanchesLong[2]; i++) {
                r.set(temp, largeur+28, temp + 48, largeur+44);
                c.drawRect(r, rouge06);
                temp = temp + 48;
            }
            for (int i = 0; i < nbreBanchesLong[1]; i++) {
                r.set(temp, largeur+28, temp + 40, largeur+44);
                c.drawRect(r, vert05);
                temp = temp + 40;
            }
            for (int i = 0; i < nbreBanchesLong[0]; i++) {
                r.set(temp, largeur+28, temp + 28, largeur+44);
                c.drawRect(r, bleu035);
                temp = temp + 28;
            }
            r.set(temp, largeur+28, temp + 28, largeur+44);
            c.drawRect(r, bleu035);
        }
        else{
            r.set(temp, 8, temp + 28, 24);
            c.drawRect(r, bleu035);
            temp+= 28;

            for (int i = 0; i < nbreBanchesLong[3]; i++) {
                r.set(temp, 8, temp + 80, 24);
                c.drawRect(r, jaune1);
                temp = temp + 80;
            }
            for (int i = 0; i < nbreBanchesLong[2]; i++) {
                r.set(temp, 8, temp + 48, 24);
                c.drawRect(r, rouge06);
                temp = temp + 48;
            }
            for (int i = 0; i < nbreBanchesLong[1]; i++) {
                r.set(temp, 8, temp + 40, 24);
                c.drawRect(r, vert05);
                temp = temp + 40;
            }
            for (int i = 0; i < nbreBanchesLong[0]; i++) {
                r.set(temp, 8, temp + 28, 24);
                c.drawRect(r, bleu035);
                temp = temp + 28;
            }
            r.set(temp, 8, temp + 28, 24);
            c.drawRect(r, bleu035);

            temp = 52;
            for (int i = 0; i < nbreBanchesLong[3]; i++) {
                r.set(temp, 52, temp + 80, 36);
                c.drawRect(r, jaune1);
                temp = temp + 80;
            }
            for (int i = 0; i < nbreBanchesLong[2]; i++) {
                r.set(temp, 52, temp + 48, 36);
                c.drawRect(r, rouge06);
                temp = temp + 48;
            }
            for (int i = 0; i < nbreBanchesLong[1]; i++) {
                r.set(temp, 52, temp + 40, 36);
                c.drawRect(r, vert05);
                temp = temp + 40;
            }
            for (int i = 0; i < nbreBanchesLong[0]; i++) {
                r.set(temp, 52, temp + 28, 36);
                c.drawRect(r, bleu035);
                temp = temp + 28;
            }

            temp = 52;
            for (int i = 0; i < nbreBanchesLong[3]; i++) {
                r.set(temp, largeur, temp + 80, largeur+16);
                c.drawRect(r, jaune1);
                temp = temp + 80;
            }
            for (int i = 0; i < nbreBanchesLong[2]; i++) {
                r.set(temp, largeur, temp + 48, largeur+16);
                c.drawRect(r, rouge06);
                temp = temp + 48;
            }
            for (int i = 0; i < nbreBanchesLong[1]; i++) {
                r.set(temp, largeur, temp + 40, largeur+16);
                c.drawRect(r, vert05);
                temp = temp + 40;
            }
            for (int i = 0; i < nbreBanchesLong[0]; i++) {
                r.set(temp, largeur, temp + 28, largeur+16);
                c.drawRect(r, bleu035);
                temp = temp + 28;
            }

            temp = 24;
            r.set(temp, largeur+28, temp + 28, largeur+44);
            c.drawRect(r, bleu035);
            temp+= 28;

            for (int i = 0; i < nbreBanchesLong[3]; i++) {
                r.set(temp, largeur+28, temp + 80, largeur+44);
                c.drawRect(r, jaune1);
                temp = temp + 80;
            }
            for (int i = 0; i < nbreBanchesLong[2]; i++) {
                r.set(temp, largeur+28, temp + 48, largeur+44);
                c.drawRect(r, rouge06);
                temp = temp + 48;
            }
            for (int i = 0; i < nbreBanchesLong[1]; i++) {
                r.set(temp, largeur+28, temp + 40, largeur+44);
                c.drawRect(r, vert05);
                temp = temp + 40;
            }
            for (int i = 0; i < nbreBanchesLong[0]; i++) {
                r.set(temp, largeur+28, temp + 28, largeur+44);
                c.drawRect(r, bleu035);
                temp = temp + 28;
            }

            r.set(temp, largeur+28, temp + 28, largeur+44);
            c.drawRect(r, bleu035);
        }
    }


    public static void dessinLargeur(Canvas c, boolean volets, int longueur, int[] nbreBanchesLarg){

        Rect r = new Rect();

        Paint noir = new Paint(Paint.ANTI_ALIAS_FLAG | Paint.DITHER_FLAG);
        noir.setStyle(Paint.Style.FILL);
        noir.setColor(Color.parseColor("#000000"));

        Paint jaune1 = new Paint(Paint.ANTI_ALIAS_FLAG | Paint.DITHER_FLAG);
        jaune1.setStyle(Paint.Style.STROKE);
        jaune1.setColor(Color.parseColor("#FEAA01"));

        Paint rouge06 = new Paint(Paint.ANTI_ALIAS_FLAG | Paint.DITHER_FLAG);
        rouge06.setStyle(Paint.Style.STROKE);
        rouge06.setColor(Color.parseColor("#EF0000"));

        Paint vert05 = new Paint(Paint.ANTI_ALIAS_FLAG | Paint.DITHER_FLAG);
        vert05.setStyle(Paint.Style.STROKE);
        vert05.setColor(Color.parseColor("#169727"));

        Paint bleu035 = new Paint(Paint.ANTI_ALIAS_FLAG | Paint.DITHER_FLAG);
        bleu035.setStyle(Paint.Style.STROKE);
        bleu035.setColor(Color.parseColor("#0182F3"));

        int temp = 24;
        if (volets) {
            r.set(8, temp, 24, temp + 28);
            c.drawRect(r, bleu035);
            temp += 28;

            int nbreBanches1 = nbreBanchesLarg[3];
            int j = 0;

            while(j<nbreBanches1) {
                r.set(8, temp, 24, temp + 80);
                c.drawRect(r, jaune1);
                temp = temp + 80;
                nbreBanches1--;
                j++;
            }
            for (int i = 0; i < nbreBanchesLarg[2]; i++) {
                r.set(8, temp, 24, temp + 48);
                c.drawRect(r, rouge06);
                temp = temp + 48;
            }
            for (int i = 0; i < nbreBanchesLarg[1]; i++) {
                r.set(8, temp, 24, temp + 40);
                c.drawRect(r, vert05);
                temp = temp + 40;
            }
            for (int i = 0; i < nbreBanchesLarg[0]; i++) {
                r.set(8, temp, 24, temp + 28);
                c.drawRect(r, bleu035);
                temp = temp + 28;
            }
            for (int i = 0; i < nbreBanches1; i++) {
                r.set(8, temp, 24, temp + 80);
                c.drawRect(r, jaune1);
                temp = temp + 80;
            }


            r.set(8, temp, 24, temp + 28);
            c.drawRect(r, bleu035);
            temp = temp + 28;

            temp = 52;
            nbreBanches1 = nbreBanchesLarg[3];
            j = 0;

            while(j<nbreBanches1) {
                r.set(52, temp, 36, temp + 80);
                c.drawRect(r, jaune1);
                temp = temp + 80;
                nbreBanches1--;
                j++;
            }
            for (int i = 0; i < nbreBanchesLarg[2]; i++) {
                r.set(52, temp, 36, temp + 48);
                c.drawRect(r, rouge06);
                temp = temp + 48;
            }
            for (int i = 0; i < nbreBanchesLarg[1]; i++) {
                r.set(52, temp, 36, temp + 40);
                c.drawRect(r, vert05);
                temp = temp + 40;
            }
            for (int i = 0; i < nbreBanchesLarg[0]; i++) {
                r.set(52, temp, 36, temp + 28);
                c.drawRect(r, bleu035);
                temp = temp + 28;
            }
            for (int i = 0; i < nbreBanches1; i++) {
                r.set(52, temp, 36, temp + 80);
                c.drawRect(r, jaune1);
                temp = temp + 80;
            }


            temp = 52;

            nbreBanches1 = nbreBanchesLarg[3];
            j = 0;

            while(j<nbreBanches1) {
                r.set(80, temp, 96, temp + 80);
                c.drawRect(r, jaune1);
                temp = temp + 80;
                nbreBanches1--;
                j++;
            }
            for (int i = 0; i < nbreBanchesLarg[2]; i++) {
                r.set(80, temp, 96, temp + 48);
                c.drawRect(r, rouge06);
                temp = temp + 48;
            }
            for (int i = 0; i < nbreBanchesLarg[1]; i++) {
                r.set(80, temp, 96, temp + 40);
                c.drawRect(r, vert05);
                temp = temp + 40;
            }
            for (int i = 0; i < nbreBanchesLarg[0]; i++) {
                r.set(80, temp, 96, temp + 28);
                c.drawRect(r, bleu035);
                temp = temp + 28;
            }
            for (int i = 0; i < nbreBanches1; i++) {
                r.set(80, temp, 96, temp + 80);
                c.drawRect(r, jaune1);
                temp = temp + 80;
            }


            //INTERIEUR

            temp = 52;
            nbreBanches1 = nbreBanchesLarg[3];
            j = 0;

            while(j<nbreBanches1) {
                r.set(112, temp, 128, temp + 80);
                c.drawRect(r, jaune1);
                temp = temp + 80;
                nbreBanches1--;
                j++;
            }
            for (int i = 0; i < nbreBanchesLarg[2]; i++) {
                r.set(112, temp, 128, temp + 48);
                c.drawRect(r, rouge06);
                temp = temp + 48;
            }
            for (int i = 0; i < nbreBanchesLarg[1]; i++) {
                r.set(112, temp, 128, temp + 40);
                c.drawRect(r, vert05);
                temp = temp + 40;
            }
            for (int i = 0; i < nbreBanchesLarg[0]; i++) {
                r.set(112, temp, 128, temp + 28);
                c.drawRect(r, bleu035);
                temp = temp + 28;
            }
            for (int i = 0; i < nbreBanches1; i++) {
                r.set(112, temp, 128, temp + 80);
                c.drawRect(r, jaune1);
                temp = temp + 80;
            }


            temp = 52;
            nbreBanches1 = nbreBanchesLarg[3];
            j = 0;

            while(j<nbreBanches1) {
                r.set(longueur, temp, longueur + 16, temp + 80);
                c.drawRect(r, jaune1);
                temp = temp + 80;
                nbreBanches1--;
                j++;
            }
            for (int i = 0; i < nbreBanchesLarg[2]; i++) {
                r.set(longueur, temp, longueur + 16, temp + 48);
                c.drawRect(r, rouge06);
                temp = temp + 48;
            }
            for (int i = 0; i < nbreBanchesLarg[1]; i++) {
                r.set(longueur, temp, longueur + 16, temp + 40);
                c.drawRect(r, vert05);
                temp = temp + 40;
            }
            for (int i = 0; i < nbreBanchesLarg[0]; i++) {
                r.set(longueur, temp, longueur + 16, temp + 28);
                c.drawRect(r, bleu035);
                temp = temp + 28;
            }
            for (int i = 0; i < nbreBanches1; i++) {
                r.set(longueur, temp, longueur + 16, temp + 80);
                c.drawRect(r, jaune1);
                temp = temp + 80;
            }

            nbreBanches1 = nbreBanchesLarg[3];
            j = 0;
            temp = 24;
            r.set(longueur+28, temp, longueur + 44, temp + 28);
            c.drawRect(r, bleu035);
            temp += 28;

            while(j<nbreBanches1) {
                r.set(longueur +28, temp, longueur + 44, temp + 80);
                c.drawRect(r, jaune1);
                temp = temp + 80;
                nbreBanches1--;
                j++;
            }
            for (int i = 0; i < nbreBanchesLarg[2]; i++) {
                r.set(longueur + 28, temp, longueur + 44, temp + 48);
                c.drawRect(r, rouge06);
                temp = temp + 48;
            }
            for (int i = 0; i < nbreBanchesLarg[1]; i++) {
                r.set(longueur + 28, temp, longueur + 44, temp + 40);
                c.drawRect(r, vert05);
                temp = temp + 40;
            }
            for (int i = 0; i < nbreBanchesLarg[0]; i++) {
                r.set(longueur + 28, temp, longueur + 44, temp + 28);
                c.drawRect(r, bleu035);
                temp = temp + 28;
            }
            for (int i = 0; i < nbreBanches1; i++) {
                r.set(longueur+28, temp, longueur + 44, temp + 80);
                c.drawRect(r, jaune1);
                temp = temp + 80;
            }

            r.set(longueur+28, temp, longueur + 44, temp + 28);
            c.drawRect(r, bleu035);
        }
        else{
            temp=24;
            r.set(8, temp, 24, temp + 28);
            c.drawRect(r, bleu035);
            temp += 28;

            int nbreBanches1 = nbreBanchesLarg[3];
            int j = 0;

            while(j<nbreBanches1) {
                r.set(8, temp, 24, temp + 80);
                c.drawRect(r, jaune1);
                temp = temp + 80;
                nbreBanches1--;
                j++;
            }
            for (int i = 0; i < nbreBanchesLarg[2]; i++) {
                r.set(8, temp, 24, temp + 48);
                c.drawRect(r, rouge06);
                temp = temp + 48;
            }
            for (int i = 0; i < nbreBanchesLarg[1]; i++) {
                r.set(8, temp, 24, temp + 40);
                c.drawRect(r, vert05);
                temp = temp + 40;
            }
            for (int i = 0; i < nbreBanchesLarg[0]; i++) {
                r.set(8, temp, 24, temp + 28);
                c.drawRect(r, bleu035);
                temp = temp + 28;
            }
            for (int i = 0; i < nbreBanches1; i++) {
                r.set(8, temp, 24, temp + 80);
                c.drawRect(r, jaune1);
                temp = temp + 80;
            }

            r.set(8, temp, 24, temp + 28);
            c.drawRect(r, bleu035);
            temp = temp + 28;

            nbreBanches1 = nbreBanchesLarg[3];
            j = 0;
            temp=52;

            while(j<nbreBanches1) {
                r.set(52, temp, 36, temp + 80);
                c.drawRect(r, jaune1);
                temp = temp + 80;
                nbreBanches1--;
                j++;
            }
            for (int i = 0; i < nbreBanchesLarg[2]; i++) {
                r.set(52, temp, 36, temp + 48);
                c.drawRect(r, rouge06);
                temp = temp + 48;
            }
            for (int i = 0; i < nbreBanchesLarg[1]; i++) {
                r.set(52, temp, 36, temp + 40);
                c.drawRect(r, vert05);
                temp = temp + 40;
            }
            for (int i = 0; i < nbreBanchesLarg[0]; i++) {
                r.set(52, temp, 36, temp + 28);
                c.drawRect(r, bleu035);
                temp = temp + 28;
            }
            for (int i = 0; i < nbreBanches1; i++) {
                r.set(52, temp, 36, temp + 80);
                c.drawRect(r, jaune1);
                temp = temp + 80;
            }

            //INTERIEUR
            temp = 52;
            nbreBanches1 = nbreBanchesLarg[3];
            j = 0;

            while(j<nbreBanches1) {
                r.set(longueur, temp, longueur + 16, temp + 80);
                c.drawRect(r, jaune1);
                temp = temp + 80;
                nbreBanches1--;
                j++;
            }
            for (int i = 0; i < nbreBanchesLarg[2]; i++) {
                r.set(longueur, temp, longueur + 16, temp + 48);
                c.drawRect(r, rouge06);
                temp = temp + 48;
            }
            for (int i = 0; i < nbreBanchesLarg[1]; i++) {
                r.set(longueur, temp, longueur + 16, temp + 40);
                c.drawRect(r, vert05);
                temp = temp + 40;
            }
            for (int i = 0; i < nbreBanchesLarg[0]; i++) {
                r.set(longueur, temp, longueur + 16, temp + 28);
                c.drawRect(r, bleu035);
                temp = temp + 28;
            }
            for (int i = 0; i < nbreBanches1; i++) {
                r.set(longueur, temp, longueur+16, temp + 80);
                c.drawRect(r, jaune1);
                temp = temp + 80;
            }

            r.set(longueur+28, 24, longueur + 44, 52);
            c.drawRect(r, bleu035);

            temp = 52;
            nbreBanches1 = nbreBanchesLarg[3];
            j = 0;

            while(j<nbreBanches1) {
                r.set(longueur +28, temp, longueur + 44, temp + 80);
                c.drawRect(r, jaune1);
                temp = temp + 80;
                nbreBanches1--;
                j++;
            }
            for (int i = 0; i < nbreBanchesLarg[2]; i++) {
                r.set(longueur + 28, temp, longueur + 44, temp + 48);
                c.drawRect(r, rouge06);
                temp = temp + 48;
            }
            for (int i = 0; i < nbreBanchesLarg[1]; i++) {
                r.set(longueur + 28, temp, longueur + 44, temp + 40);
                c.drawRect(r, vert05);
                temp = temp + 40;
            }
            for (int i = 0; i < nbreBanchesLarg[0]; i++) {
                r.set(longueur + 28, temp, longueur + 44, temp + 28);
                c.drawRect(r, bleu035);
                temp = temp + 28;
            }
            for (int i = 0; i < nbreBanches1; i++) {
                r.set(longueur+28, temp, longueur + 44, temp + 80);
                c.drawRect(r, jaune1);
                temp = temp + 80;
            }

            r.set(longueur+28 , temp, longueur + 44, temp + 28);
            c.drawRect(r, bleu035);
        }
    }

    public static void dessinLeg( Canvas Legende, int[] nbreBanchesTot){

        Rect r = new Rect();
        String textLegende;

        Paint noir = new Paint(Paint.ANTI_ALIAS_FLAG | Paint.DITHER_FLAG);
        noir.setStyle(Paint.Style.FILL);
        noir.setColor(Color.parseColor("#000000"));

        Paint jaune1 = new Paint(Paint.ANTI_ALIAS_FLAG | Paint.DITHER_FLAG);
        jaune1.setStyle(Paint.Style.STROKE);
        jaune1.setColor(Color.parseColor("#FEAA01"));

        Paint rouge06 = new Paint(Paint.ANTI_ALIAS_FLAG | Paint.DITHER_FLAG);
        rouge06.setStyle(Paint.Style.STROKE);
        rouge06.setColor(Color.parseColor("#EF0000"));

        Paint vert05 = new Paint(Paint.ANTI_ALIAS_FLAG | Paint.DITHER_FLAG);
        vert05.setStyle(Paint.Style.STROKE);
        vert05.setColor(Color.parseColor("#169727"));

        Paint bleu035 = new Paint(Paint.ANTI_ALIAS_FLAG | Paint.DITHER_FLAG);
        bleu035.setStyle(Paint.Style.STROKE);
        bleu035.setColor(Color.parseColor("#0182F3"));

        noir.setTextSize(40);

        if (nbreBanchesTot[3] > 0) {
            r.set(8, 8, 168, 40);
            Legende.drawRect(r, jaune1);
            textLegende = "1M X" + nbreBanchesTot[3];
            Legende.drawText(textLegende, 176, 40, noir);
        }

        if (nbreBanchesTot[2] > 0) {
            r.set(400, 8, 496, 40);
            Legende.drawRect(r, rouge06);
            textLegende = "0,6M X" + nbreBanchesTot[2];
            Legende.drawText(textLegende, 504, 40, noir);
        }

        if (nbreBanchesTot[1] > 0) {
            r.set(400, 60, 480, 92);
            Legende.drawRect(r, vert05);
            textLegende = "0,5M X" + nbreBanchesTot[1];
            Legende.drawText(textLegende, 504, 92, noir);
        }
        if (nbreBanchesTot[0] > 0) {
            r.set(8, 60, 64, 92);
            Legende.drawRect(r, bleu035);
            textLegende = "0,35M X" + nbreBanchesTot[0];
            Legende.drawText(textLegende, 176, 92, noir);
        }

    }

    public static Bitmap mergeBitmap(Bitmap fr, Bitmap sc){
        Bitmap comboBitmap;
        int width, height;
        width = fr.getWidth() + sc.getWidth();
        height = fr.getHeight();

        comboBitmap = Bitmap.createBitmap(width, height,Bitmap.Config.ARGB_8888);

        Canvas comboImage = new Canvas(comboBitmap);

        comboImage.drawBitmap(fr,0f,0f,null);
        comboImage.drawBitmap(sc,fr.getWidth(),0f,null);

        return  comboBitmap;
    }

    public static boolean createPdf(Bitmap b,String nomClient){

        PdfDocument document = new PdfDocument();
        PdfDocument.PageInfo pageInfo = new PdfDocument.PageInfo.Builder(b.getWidth(), b.getHeight(), 1).create();
        PdfDocument.Page page = document.startPage(pageInfo);

        Canvas canvas = page.getCanvas();


        Paint paint = new Paint();
        paint.setColor(Color.parseColor("#ffffff"));
        canvas.drawPaint(paint);

        b = Bitmap.createScaledBitmap(b, b.getWidth(), b.getHeight(), true);

        paint.setColor(Color.BLUE);
        canvas.drawBitmap(b, 0, 0 , null);
        document.finishPage(page);

        // write the document content
        File filePath = new File(Environment.getExternalStorageDirectory(),"SimulationPlan");
        if(!filePath.exists()){
            filePath.mkdir();
        }
        String nomFichier = "SimuPiscine_" + nomClient + ".pdf";
        File pdf = new File(filePath, nomFichier);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(pdf);
            document.writeTo(fileOutputStream);
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        // close the document
        document.close();
        return true;
    }
}

