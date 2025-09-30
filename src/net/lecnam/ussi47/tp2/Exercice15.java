package net.lecnam.ussi47.tp2;

public class Exercice15 {
    public static void main(String[] args) {
        int hauteur = 10;
        for (int i=0;i<hauteur;i++) {
            for (int j=0;j<hauteur-i-1;j++) System.out.print(" ");
            for (int j=0;j<2*i+1;j++) System.out.print("*");
            System.out.println();
        }
    }
}
