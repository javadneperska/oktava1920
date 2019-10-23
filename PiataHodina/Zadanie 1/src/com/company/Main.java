package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        {

            Scanner sc = new Scanner(System.in);
            System.out.println("zadaj cislo a");
            int a = sc.nextInt();

            Scanner bb = new Scanner(System.in);
            System.out.println("zadaj cislo b");
            int b = sc.nextInt();

            int sucet = a + b;
            int rozdiel = a - b;
            int sucin = a * b;
            int podiel = a / b;
            System.out.println("sucet " + sucet);
            System.out.println("rozdiel " + rozdiel);
            System.out.println("sucin " + sucin);
            System.out.println("podiel " + podiel);

        }}}