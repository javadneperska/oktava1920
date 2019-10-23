package sk.gymbosak;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {    
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadaj cislo:");
        int j = sc.nextInt();
        for (int i = (j - 1); i > 1; i--){
            if(j%i==0){
                System.out.println("Nie je to prvocislo.");
                return;
            }
        }
        System.out.println("Je to prvocislo");
    }
}
