package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int[] pole = new int[10];
        System.out.println("Zadajte 10 cisel: ");
            for(int i = 0; i<10;i++)
            {
                pole[i] = sc.nextInt();
            }

        boolean ab = true;
        while(ab)
        {
            ab = false;
            for(int i=0; i<pole.length-1; i++)
            {
                if(pole[i] <pole[i+1])
                {
                    ab = true;
                    int vyssie = pole[i+1];
                    pole[i+1] =pole[i];
                    pole[i] = vyssie;
                }
            }
        }
        for(int i : pole) {
            System.out.print(i + " ");
        }
    }
}
