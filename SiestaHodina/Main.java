package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("zadaj cislo 1");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        System.out.println("zadaj cislo 2");

        double b = sc.nextDouble();
        System.out.println("sucet:" + (a+b));
        System.out.println("minus:" + (a-b));
        System.out.println("krat:" + (a*b));
        System.out.println("deleno:" + (a/b));


    }
}
