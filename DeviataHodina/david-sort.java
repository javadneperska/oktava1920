package sk.gymbosak;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] cisla = new int[10];
        for(int i=0; i<cisla.length; i++) {
            System.out.println("cislo " + i + ": ");
            cisla[i] = sc.nextInt();
        }
        boolean changed = true;
        while(changed)
        {
            changed = false;
            for(int i=0; i<cisla.length-1; i++)
            {
                if(cisla[i] < cisla[i+1])
                {
                    changed = true;
                    int higher = cisla[i+1];
                    cisla[i+1] = cisla[i];
                    cisla[i] = higher;
                }
            }
        }
        for(int i : cisla) {
            System.out.print(i);
        }
    }
}
