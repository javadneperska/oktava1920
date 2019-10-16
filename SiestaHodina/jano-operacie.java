package sk.gymbosak;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hodnota 1:");
        float val1 = sc.nextFloat();
        System.out.println("Hodnota 2:");
        float val2 = sc.nextFloat();
        System.out.println(val1+val2);
        System.out.println(val1-val2);
        System.out.println(val1*val2);
        System.out.println(val1/val2);
    }
}
