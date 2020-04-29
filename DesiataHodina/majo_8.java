package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Zadaj číslo:");
        int a = sc.nextInt();

        Random random = new Random();
        for(int i = 0; i < 20; i++)
        {
            if(random.nextInt(50) == a)
            {
                System.out.println("Našiel");
                return;
            }
        }
        System.out.println("Nenašiel");
    }
}
