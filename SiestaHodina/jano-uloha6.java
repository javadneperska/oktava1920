package sk.gymbosak;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {    
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadaj mesiac cislom:");
        int j = sc.nextInt();
        if(j >= 3 && j <= 5)
            System.out.println("jar");
        else if(j >= 6 && j <= 8)
            System.out.println("leto");
        else if(j >= 9 && j <= 11)
            System.out.println("jesen");
        else
            System.out.println("zima");
    }
}
