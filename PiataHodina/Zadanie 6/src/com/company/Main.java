package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        {

            Scanner sc = new Scanner(System.in);
            System.out.println("zadaj cislo mesiaca");
            int a = sc.nextInt();
            if(a>2 && a<6)
            System.out.println("jar");
            else if(a>5 && a < 9)
            System.out.println("leto");
            else if(a>8 && a < 12)
            System.out.println("jesen");
            else System.out.println("zima");
    }
}}
