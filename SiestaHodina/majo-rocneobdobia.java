package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Zadajte cislo" );
        int a = sc.nextInt();

        if(a==12 || a <=2){
            System.out.println("Je to zimny mesiac");
        }

        else if(a>=3 && a <=5){
            System.out.println("Je to jarny mesiac");
        }
        else if(a>=6 && a <=8){
            System.out.println("Je to letny mesiac");
        }
        else if(a>=9 && a <=11){
            System.out.println("Je to jesenny mesiac");
        }

    }
}
