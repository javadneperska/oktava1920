package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("zadaj Z");
    int Z = scan.nextInt();
    int K = scan.nextInt();




     int a;
        for(a=Z; a<=K; a++)
            if ( a % 2 == 0 )
                System.out.println(a + " cislo je parne");
            else
                System.out.println(a + " cislo je neparne");
        }}