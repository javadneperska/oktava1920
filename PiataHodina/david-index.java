package sk.gymbosak;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("rozmer pola:");
        int fieldSize = sc.nextInt();
        int[] field = new int[fieldSize];
        for (int i = 0; i < field.length; i++) {
            System.out.println("index " + i + ":");
            field[i] = sc.nextInt();
        }
        while (true)
        {
            System.out.println("moznosti:");
            System.out.println("1. uloha");
            System.out.println("2. uloha");
            System.out.println("3. uloha");
            int choice = sc.nextInt();
            if (choice == 1) {
                System.out.println("hodnota na najdenie:");
                int value = sc.nextInt();
                for(int i=0; i<field.length; i++)
                {
                    if(field[i] == value)
                    {
                        System.out.println(i + " index");
                    }
                }

            } else if (choice == 2) {
                System.out.println("index na nahradenie:");
                int index = sc.nextInt();
                System.out.println("hodnota:");
                int value = sc.nextInt();
                field[index] = value;
            } else if (choice == 3) {
                System.out.println("index na vymazanie:");
                int index = sc.nextInt();
                int[] newfield = new int[field.length-1];
                for(int i=0; i<field.length-1; i++)
                {
                    if(i < index) {
                        newfield[i] = field[i];
                    } else if(i >= index){
                        newfield[i] = field[i+1];
                    }
                }
                field = newfield;
            } else {
                System.out.println("invalid");
            }
            for (int c : field) {
                System.out.print(c + " ");
            }
        }
    }
}
