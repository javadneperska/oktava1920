package sk.gymbosak;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("value:");
        int num = sc.nextInt();
        int[] array = new int[20];
        for(int i=0; i<20; i++)
        {
            Random kkt = new Random();
            array[i] = kkt.nextInt(50);
            System.out.println(array[i]);
        }
        for(int i : array)
        {
            if(i == num)
                System.out.println("naslo sa");
        }

    }
}
