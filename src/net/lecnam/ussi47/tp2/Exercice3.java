package net.lecnam.ussi47.tp2;

public class Exercice3 {

    public static void main(String[] args) {

        // Dimensions d'un carré de jardin
        double longueur = 1.25 ;
        double largeur = 1.25 ;
        int nombreCarres = 4 ;
        int plantesParCarre = 9 ;

        // Calculs
        double surfaceTotale = longueur * largeur * nombreCarres ;
        int nombrePlantesTotales = plantesParCarre * nombreCarres ;
        double surfaceParPlante = surfaceTotale / nombrePlantesTotales ;

        // Affichage
        System.out.println("Surface cultivée totale : " + surfaceTotale + " m²") ;
        System.out.println("Nombre total de plantes : " + nombrePlantesTotales) ;
        System.out.println("Surface par plante : " + surfaceParPlante + " m²") ;
    }
}
