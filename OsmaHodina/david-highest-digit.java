package sk.gymbosak;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("cislo:");
        String cislo = sc.nextLine();
        int highest = 0;
        for(char c : cislo.toCharArray())
        {
            int num = Character.getNumericValue(c);
            if(num > highest)
                highest = num;
        }
        System.out.println("highest is " + highest);
    }
}
