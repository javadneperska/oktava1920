package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("zadajte cislo: ");
        int a = sc.nextInt();
        int b = a;
        if (a > 0) {
            for (int i = (a-1); i > 0; i--) {
                b=b*i;
            }
            System.out.println(b);
        }
    }
}
