package sk.gymbosak;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {    
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadaj cislo:");
        int cislo = sc.nextInt();
        int cifra = cislo % 10;
        for(int i = 10; i < cislo; i *= 10)
        {
            int akt = (cislo / i) % 10;
            if(akt > cifra)
                cifra = akt;
        }
        System.out.println("najvacsia cifra: " + cifra);
    }
}
