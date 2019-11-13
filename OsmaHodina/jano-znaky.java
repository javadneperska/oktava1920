package sk.gymbosak;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {    
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadaj slovo:");
        String slovo = sc.nextLine().toLowerCase();
        String abeceda = "abcdefghijklmnopqrstuvwxyz";
        for(char c : abeceda.toCharArray())
        {
            int pocet = 0;
            for(char i : slovo.toCharArray())
            {
                if(c == i)
                    pocet++;
            }
            if(numberFound > 0)
            {
                System.out.println("znak " + c + " - " + pocet + "krat");
            }
        }
    }
}
