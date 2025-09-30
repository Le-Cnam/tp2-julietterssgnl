package net.lecnam.ussi47.tp2;

public class Exercice16 {
    public static void main(String[] args) {
        int h = 10;
        for (int i=0;i<h;i++) {
            for(int j=0;j<h-i-1;j++) System.out.print(" ");
            for(int j=0;j<2*i+1;j++) {
                if(j==0 || j==2*i || i==h-1) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
