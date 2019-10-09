package sk.gymbosak;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] pole = {1, 2, 3, 4, 5};
        int hodnota = sc.nextInt();
        for(int i = 0; i < pole.length; i++)
        {
            if(pole[i] == hodnota)
            {
                System.out.println(i);
            }
        }
    }
}
