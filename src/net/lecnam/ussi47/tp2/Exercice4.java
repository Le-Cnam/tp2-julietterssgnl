package net.lecnam.ussi47.tp2;

public class Exercice4 {

    public static void main(String[] args) {
        int metres = 4000;
        float facteurConversion = 3.28084f;
        float pieds = metres * facteurConversion;

        System.out.println("Facteur de conversion : " + facteurConversion);
        System.out.println(metres + " mètres = " + pieds + " pieds");
    }
}
