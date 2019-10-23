package sk.gymbosak;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {    
        Scanner sc = new Scanner(System.in);
        int[] pole = new int[6];
        for(int i = 0;i < 5;i++)
        {
            System.out.println("zadaj cislo: ");
            pole[i] = sc.nextInt();
        }
        for(int i = 0;i < 5;i++)
        {
            pole[i+1] = pole[i];
        }
        System.out.println(Arrays.toString(list));
    }
}
