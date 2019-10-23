package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     int[] pole = new int[5];
     for(int i = 0; i<5;i++){
         System.out.println("zadaj cislo");
         pole[i]=sc.nextInt()+1;
     }
        System.out.println(Arrays.toString(pole));

    }
}
