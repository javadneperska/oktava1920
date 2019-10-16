package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Zadajte slovo");
        String a = sc.nextLine();
        String vysledok = "";
        System.out.println(a);

        for(int i = a.length(); i>0; i--){
            vysledok = vysledok + a.toCharArray()[i-1];

        }
        System.out.println(vysledok);
        System.out.println(a.length());

    }
}
