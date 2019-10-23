package sk.gymbosak;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Zadaj cislo:");
        int cislo = sc.nextInt();

        Random r = new Random();
        for(int i = 0; i < 20; i++)
        {
            if(r.nextInt(100) == cislo)
            {
                System.out.println("uhadnute");
                return;
            }
        }
        System.out.println("nebolo medzi nahodnymi");
    }
}
