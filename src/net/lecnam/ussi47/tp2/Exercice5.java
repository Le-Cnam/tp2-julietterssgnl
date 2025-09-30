package net.lecnam.ussi47.tp2;

public class Exercice5 {

    public static void main(String[] args) {
        int puissanceRadiateur = 500;       // W
        int volumeParRadiateur = 8;         // m³

        float longueur = 3.40f;
        float largeur = 4.30f;
        float hauteur = 2.30f;
        float volumePiece = longueur * largeur * hauteur;

        // nombre de radiateurs nécesaires (arrondi à l'entier supérieur)
        float nombreRadiateurs = volumePiece / volumeParRadiateur;

        System.out.println("Volume de la pièce : " + volumePiece + " m³");
        System.out.println("Nombre de radiateurs nécessaires : " + nombreRadiateurs);
    }
}
