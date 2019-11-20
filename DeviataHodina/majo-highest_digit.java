package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("cislo:");
        String cislo = sc.nextLine();

        int najvyssie = 0;
        for(char a : cislo.toCharArray())
        {
            int abc = Character.getNumericValue(a);
            if(abc > najvyssie)
                najvyssie = abc;
        }
        System.out.println("najvacsie cislo je:  " + najvyssie);
    }
}
