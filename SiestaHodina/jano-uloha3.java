package sk.gymbosak;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {    
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadaj 10 cisel:");
        for(int i=0; i<10; i++) {
            int j = sc.nextInt();
            if(j % 3 == 0 || j % 4 == 0){
                System.out.println("je: " + j);
            }
        }
    }
}
