package net.lecnam.ussi47.tp2;

public class Exercice12 {
    public static void main(String[] args) {
        String phrase = "cette phrase contient 11 voyelles".toLowerCase();
        int nombreVoyelles = 0;
        for (char c : phrase.toCharArray()) {
            if ("aeiouy".indexOf(c) >= 0) nombreVoyelles++;
        }
        System.out.println("Nombre de voyelles : " + nombreVoyelles);
    }
}
