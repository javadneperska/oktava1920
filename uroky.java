package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int vklad;
	float urok;
	int roky;
        Scanner scanner = new Scanner (System.in);

        System.out.println("nacitaj vklad:");
        vklad = scanner.nextInt();
        System.out.println("Nacitaj urok");
        urok = scanner.nextFloat();
        System.out.println("Nacitaj roky:");
        roky = scanner.nextInt();

        for (int i = 0; i<roky; i++) {
            vklad *= (urok / 100 + 1);
            System.out.println(("Vklad po " +  (i+1) + " rokoch:" + vklad));
        }
        }


    }

