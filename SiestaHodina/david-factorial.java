package sk.gymbosak;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("hodnota:");
        int val = sc.nextInt();
        System.out.println("vysledok: " + getFactorial(val));
    }

    public static long getFactorial(int number)
    {
        long result = 1;
        for(long i=number; i>1; i--)
        {
            result *= i;
        }
        return result;
    }
}
