package sk.gymbosak;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> dokonaleCisla = new ArrayList<Integer>();

        for(int i=1; i<10000; i++)
        {
            int[] delitele = new int[10000];
            int sucetDelitelov = 0;

            for(int j=1; j<=i; j++)
            {
                if(i % j == 0)
                {
                    sucetDelitelov = j+sucetDelitelov;
                }
            }

            if(sucetDelitelov / 2 <= i)
            {
                dokonaleCisla.add(i);
            }
        }
        for(int i : dokonaleCisla)
        {
            System.out.println(i);
        }
    }
}
