package sk.gymbosak;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadaj slovo:");
        String slovo = sc.nextLine().toLowerCase();
        String pismena = "jdonfoloannjeolvnjbykbxwaw";
        for(char c : pismena.toCharArray())
        {
            int pocet = 0;
            for(char i : slovo.toCharArray())
            {
                if(c == i)
                    pocet++;
            }
            int pocetCisel;
            if(pocetCisel > 0)
            {
                System.out.println("znak " + c + " - " + pocet + "krat");
            }
        }
    }
}