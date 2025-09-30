package net.lecnam.ussi47.tp2;

public class Exercice2 {

    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int c = 5;

        // calcul des carrés
        int carreA = a * a;
        int carreB = b * b;
        int carreC = c * c;

        if (carreA + carreB == carreC) {
            System.out.println("Le théorème de Pythagore est vérifié !");
        } else {
            System.out.println("Le théorème de Pythagore n'est pas vérifié.");
        }

        System.out.println(a + "^2 + " + b + "^2 = " + carreA + " + " + carreB + " = " + (carreA + carreB));
        System.out.println("c^2 = " + carreC);


    }
}
