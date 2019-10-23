package com.company;

        import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("zadaj faktorial");
        int a = sc.nextInt();
        int b = 1;

        if (a < 0)
            System.out.println("Hodnota musi byt kladna");
        else
        {
            for(int i = 1; i <= a; i++)
            {
                b = b * i;
            }
            System.out.println("Faktorial z a "+a+" je: "+b);


        }}
}
