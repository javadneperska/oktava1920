package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("zadaj hodnoty");
         int a = sc.nextInt();
         int b = sc.nextInt();

        if(a>0){
            System.out.println("obsah: " + (a*b));
            System.out.println("obvod: " + (2*a+2*b));
        }
    }
}
