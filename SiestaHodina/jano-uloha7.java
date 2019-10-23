package sk.gymbosak;

import java.util.Scanner;
import java.lang.StringBuilder;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Zadaj slovo:");
        String a = sc.nextLine();
        System.out.println(a);
        StringBuilder sb = new StringBuilder();
        sb.append(a);
        sb = sb.reverse();
        System.out.println(sb);
        System.out.println(a.length());
    }
}
