package sk.gymbosak;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] pocetDelitelov = new int[10000];
        int najviacDelitelov = 0;
        int indexNajviac = 0;
        for(int i=1; i<10000; i++)
        {
            for(int j=1; j<i; j++)
            {
                if(i % j == 0) {
                    pocetDelitelov[i]++;
                }
            }
        }
        for(int i=1; i<10000; i++)
        {
            if(pocetDelitelov[i] > najviacDelitelov)
            {
                najviacDelitelov = pocetDelitelov[i];
                indexNajviac = i;
            }
        }
        for(int i=1; i<10000; i++)
        {
            if(pocetDelitelov[i] == najviacDelitelov)
            {
                System.out.println("cislo " + i + " s " + pocetDelitelov[i] + " delitelov");
            }
        }
    }
}
