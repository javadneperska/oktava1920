package sk.gymbosak;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hodnota 1:");
        int val1 = sc.nextInt();
        System.out.println("Hodnota 2:");
        int val2 = sc.nextInt();
        int min = val1 < val2 ? val1 : val2;
        int max = val1 > val2 ? val1 : val2;
        min = min % 2 == 1 ? min + 1 : min;
        for(int i=min; i<max+1; i+=2)
        {
            System.out.println(i);
        }
    }
}
