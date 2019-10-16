package sk.gymbosak;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("hodnota:");
        int val = sc.nextInt();
        if(isPrime(val))
            System.out.println("je prvocislo");
        else System.out.println("nie je prvocislo");
    }

    public static boolean isPrime(int number)
    {
        for(int i=number-1; i>1; i--) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
