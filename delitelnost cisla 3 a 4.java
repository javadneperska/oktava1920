package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Zadaj cislo");
        Scanner input = new Scanner(System.in);

        int[] x =new int[10];
        for(int i = 0; i<10; i++){
        x[i] = input.nextInt();
        }

        for(int i = 0; i<10; i++){
            if (x[i] % 3==0 || x[i]%4==0){
                System.out.println(x[i] + " delitelne 3 alebo 4");
            }
        }



    }
}