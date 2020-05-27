package com.appli.theolaperrouse.edeneau;

/**
 * Created by theolaperrouse on 27/03/2018.
 */

public class CalculBanches {
    public static int[] NbreBanches (int taille, boolean volet){
        int []nbreBanches = new int [4];
        if (volet) {
            taille = taille - 95;
        }

        if (taille%10 == 5){
            nbreBanches[0]++;
            taille = taille - 35;
        }
        switch (taille%100){
            case 10:
                nbreBanches[1]++;
                taille = taille - 50;
                break;
            case 20:
                nbreBanches[2]++;
                taille = taille - 60;
                break;
            case 30:
                nbreBanches[2] = nbreBanches[2] +3;
                nbreBanches[1] = nbreBanches[1] + 1;
                taille = taille - 230;
                break;
            case 40:
                nbreBanches[2] = nbreBanches[2] + 4;
                taille = taille - 240;
                break;
            case 50:
                nbreBanches[1]++;
                taille = taille - 50;
                break;
            case 60:
                nbreBanches[2]++;
                taille = taille - 60;
                break;
            case 70:
                nbreBanches[0] = nbreBanches[0] + 2;
                taille = taille - 70;
                break;
            case 80:
                nbreBanches[2] = nbreBanches[2] + 3;
                taille = taille - 180;
                break;
            case 90:
                nbreBanches[2] = nbreBanches[2] +4;
                nbreBanches[1] = nbreBanches[1] + 1;
                taille = taille - 290;
                break;

        }
        nbreBanches[3] = nbreBanches[3] + taille/100;
        return nbreBanches;
    }

}


