package sk.dneperska;

import java.util.Scanner ;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[] pocetDelitel = new int[1000];
        int najviacDelitel = 0;
        int indexNajviac = 0;
        for(int i = 1; i < 1000; i++)
        {
            for(int j = 1; j < i; j++)
            {
                if(i % j == 0) {
                    pocetDelitel[i]++;
                }
            }
        }
        for(int i = 1; i < 1000; i++)
        {
            if(pocetDelitel[i] > najviacDelitel)
            {
                najviacDelitel = pocetDelitel[i];
                indexNajviac = i;
            }
        }
        for(int i = 1; i < 1000; i++)
        {
            if(pocetDelitel[i] == najviacDelitel)
            {
                System.out.println("cislo " + i + " s " + pocetDelitel[i] + " delitelmi");
            }
        }
    }
}


