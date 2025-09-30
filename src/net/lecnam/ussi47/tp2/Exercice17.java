package net.lecnam.ussi47.tp2;

import java.util.Scanner;

public class Exercice17 {

    public static void main(String[] args) throws InterruptedException {

        while (true) {
            System.out.println("Veuillez sélectionner le nombre d'étoile dans la base du sapin (entre 1 et 20) :");
            System.out.println("Pour quitter, taper une lettre");
            Scanner sc = new Scanner(System.in);
            try {
                int nbEtoiles = Integer.parseInt(sc.nextLine());
                if (nbEtoiles > 0 && nbEtoiles < 21) {
                    System.out.println("Dessin du sapin avec une base de " + nbEtoiles);

                    int hauteur = (nbEtoiles + 1) / 2; // hauteur approximative du sapin

                    for (int i = 0; i < hauteur; i++) {
                        int nbEtoilesLigne = 2 * i + 1;          // nombre d'étoiles sur la ligne
                        int espaces = (nbEtoiles - nbEtoilesLigne) / 2; // espaces à gauche
                        for (int j = 0; j < espaces; j++) System.out.print(" ");
                        for (int j = 0; j < nbEtoilesLigne; j++) System.out.print("*");
                        System.out.println();
                    }



                }
            } catch (Exception e) {
                break;
            }

            Thread.sleep(3000);

        }

    }
}
