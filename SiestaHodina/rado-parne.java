package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("cislo 1:");
        Scanner sc = new Scanner(System.in);
        int z = sc.nextInt();
        System.out.println("cislo 2");
        int k = sc.nextInt();
        if (z < k) ;
        else {
            System.out.println("Cislo 1 nemoze byt vacsie");
        }
        if ((z % 2) == 0) ;
        else {
            System.out.println("Cislo nie je parne");
        }

        for (int i = z; i < k + 1; i++) {
            if (i % 2 == 0) {
                System.out.println(i);


            }


        }
    }
}
