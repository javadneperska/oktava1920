package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Random random = new Random();
        int a = random.nextInt(19) + 1;
        int hp = 5;
        int zadanecislo = 0;

            for(int i = hp; i>0;i--){
                System.out.println("pokusy: " + i);
                System.out.println("zadaj cislo: ");
                zadanecislo=sc.nextInt();

                        if(zadanecislo>a){
                            System.out.println("tvoje cislo je vacsie.");
                        }
                        else if (zadanecislo<a){
                            System.out.println("tvoje cislo je mensie.");
                        }
                        else{
                            System.out.println("cislo " + zadanecislo + " si trafil.");
                        }
            }
    }
}
