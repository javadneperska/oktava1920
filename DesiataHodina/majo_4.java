package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int b = 1;
    int a;
        System.out.println("zadaj cislo");
    a=sc.nextInt();

    for(int i = 1; i<=a; i++) {
        b = b * i;
    }
    System.out.println(b);

    }
}
