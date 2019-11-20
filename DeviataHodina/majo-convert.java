package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Zadajte °C: ");
        Scanner sc =new Scanner(System.in);
        double celzia = sc.nextDouble();
        double fahrenheit;

        fahrenheit = (celzia * 1.8) + 32;

        System.out.println(fahrenheit + " °F");

    }
}
