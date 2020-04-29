package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float a;
        float b;

        System.out.println("zadajte cislo");
        a=sc.nextFloat();
        System.out.println("zadajte cislo");
        b=sc.nextFloat();

        System.out.println("sucet: " + (a+b));
        System.out.println("rozdiel: " + (a-b));
        System.out.println("sucin: " + (a*b));
        System.out.println("podiel: " + (a/b));
    }
}
