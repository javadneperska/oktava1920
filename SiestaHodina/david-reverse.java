package sk.gymbosak;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        String result = "";
        for(int i=word.length(); i>0; i--)
        {
            result = result + word.toCharArray()[i-1];
        }
        System.out.println("text: " + result);
        System.out.println("Znaky: " + word.length());
    }
}
