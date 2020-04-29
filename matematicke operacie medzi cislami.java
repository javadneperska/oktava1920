package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("zadaj 2 cisla");
        Scanner scanner = new Scanner(System.in);
        int b;
        int c;

        b = scanner.nextInt();
        c = scanner.nextInt();


        System.out.println("deleno " + (b/c));
        System.out.println("krat " + (b*c));
        System.out.println("plus" + (b+c));
        System.out.println("minus" + (b-c));

    }
}
