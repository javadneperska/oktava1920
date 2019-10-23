package sk.gymbosak;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("a?");
        int a = sc.nextInt();
        System.out.println("b?");
        int b = sc.nextInt();
        System.out.println("obvod: " + returnSize(a,b));
        System.out.println("obsah: " + returnVolume(a,b));
    }

    public static int returnSize(int a, int b)
    {
        return 2*(a+b);
    }

    public static int returnVolume(int a, int b)
    {
        return a*b;
    }
}
