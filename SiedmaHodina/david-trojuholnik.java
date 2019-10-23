package sk.gymbosak;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("size?");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        for(int i=0; i<size; i++)
        {
            System.out.print("*  ");
            for(int j=0; j<size; j++)
            {
                if(j == 0){
                    continue;
                }
                if(i == size-1){
                    System.out.print("*  ");
                } else if(i != 0 && j == i)
                {
                    System.out.print("*   ");
                }
                else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
