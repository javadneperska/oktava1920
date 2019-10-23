package sk.gymbosak;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {    
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadaj stranu a:");
        int a = sc.nextInt();
        System.out.println("Zadaj stranu b:");
        int b = sc.nextInt();
        System.out.println("Obsah: " + (a*b));
        System.out.println("Obvod: " + (2*(a+b)));
    }
}
