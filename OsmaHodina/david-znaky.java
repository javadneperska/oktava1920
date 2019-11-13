package sk.gymbosak;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("slovo:");
        String kkt = sc.nextLine().toLowerCase();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        for(char c : alphabet.toCharArray())
        {
            int numberFound = 0;
            for(char k : kkt.toCharArray())
            {
                if(k == c)
                    numberFound++;
            }
            if(numberFound > 0)
            {
                System.out.println("znak " + c + " bol pouzity " + numberFound + "krat");
            }
        }
    }
}
