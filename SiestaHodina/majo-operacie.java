package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

	    Scanner sc = new Scanner(System.in);

        System.out.println("Zadajte 1. cislo: ");
            double a = sc.nextDouble();
        System.out.println("Zadajte 2. cislo: ");
            double b = sc.nextDouble();

        System.out.println("Sucet: " + (a+b));
        System.out.println("Rozdiel: " + (a-b));
        System.out.println("Sucin: " + (a*b));
        System.out.println("Podiel: " + (a/b));

    }
}
