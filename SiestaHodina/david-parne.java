package sk.gymbosak;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("hodnota 1:");
        int val1 = sc.nextInt();
        System.out.println("hodnota 2:");
        int val2 = sc.nextInt();
        if(val1 < val2)
        {
            for(int i=val1; i<val2+1; i++)
            {
                if(i % 2 == 0) {
                    System.out.println(i);
                }
            }
        }
        else {
            for(int i=val2; i<val1+1; i++)
            {
                if(i % 2 == 0) {
                    System.out.println(i);
                }
            }
        }
    }
}
