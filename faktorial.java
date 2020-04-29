package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int c, i = 1;
        long faktorial = 1;
        while(i <= c)
        {
            faktorial *= i;
            i++;
        }
        System.out.printf("je %d = %d", c, faktorial);
    }
}
