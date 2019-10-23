package sk.dneperska;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> dokonaleCislo = new ArrayList<Integer>();

        for(int a=1; a<10000; a++)
        {
            int[] vsetkydelitele = new int[10000];
            int sucetDelitelov = 0;

            for(int b=1; b<=a; b++)
            {
                if(a % b == 0)
                {
                    sucetDelitelov = b +sucetDelitelov;
                }
            }

            if(sucetDelitelov / 2 <= a)
            {
                dokonaleCislo.add(a);
            }
        }
        for(int i : dokonaleCislo)
        {
            System.out.println(i);
        }
    }
}

