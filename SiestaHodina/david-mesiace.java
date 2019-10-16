package sk.gymbosak;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        if(month >= 3 && month <= 5)
            System.out.println("jarny");
        else if(month >= 6 && month <= 8)
            System.out.println("letny");
        else if(month >= 9 && month <= 11)
            System.out.println("jesenny");
        else System.out.println("zimny");
    }
}
