package sk.gymbosak;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("suma:");
        float defaultAmount = sc.nextFloat();
        float amount = defaultAmount;
        int usedNotes = 0;
        int usedCoins = 0;
        float[] notes = {500, 200, 100, 50, 20, 10, 5, 2, 1, 0.5f, 0.2f, 0.1f, 0.05f, 0.02f, 0.01f};
        for(float note : notes)
        {
            while((amount-note) >= 0)
            {
                amount = amount-note;
                if(note >= 1) {
                    usedNotes++;
                    System.out.println("bankovka " + note + ", zbytok " + amount);
                } else {
                    usedCoins++;
                    System.out.println("minca " + note + ", zbytok " + amount);
                }

            }
        }
        System.out.println("");
        System.out.println("pouzitych bankoviek: " + usedNotes);
        System.out.println("pouzitych minci: " + usedCoins);
    }
}
