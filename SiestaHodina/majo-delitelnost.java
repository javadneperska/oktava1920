package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] pole = new int[10];

        for(int i=0; i<10; i++) {
            pole[i] = sc.nextInt();
        }
        for(int i=0; i<10;i++){
            if(pole[i]%3 == 0 || pole[i]%4 == 0){
                System.out.println(pole[i]);
            }
        }

    }
}

