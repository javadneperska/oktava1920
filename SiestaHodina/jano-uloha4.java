package sk.gymbosak;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {    
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadaj cislo:");
        int j = sc.nextInt();
        int k = 1;
        for(; j>0; j--) {
            k *= j;
        }
        System.out.println(k);
    }
}
