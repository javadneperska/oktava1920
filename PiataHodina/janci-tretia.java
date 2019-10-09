package sk.gymbosak;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] pole = {1, 2, 3, 4, 5};
        int index = sc.nextInt();
        pole[index] = 0;
    }
}
