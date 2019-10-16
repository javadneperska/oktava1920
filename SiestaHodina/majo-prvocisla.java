package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("zadajte cislo: ");
        int a = sc.nextInt();
        int b = 0;
        for (int i = (a - 1); i > 1; i--){


            if(a%i==0){
                System.out.println("Nie je to prvocislo.");
                b++;
            }
        }
        if(b==0){
            System.out.println("Je to prvocislo");
        }
    }
}
