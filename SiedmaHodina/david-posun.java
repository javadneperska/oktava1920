package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrSize = 5;
        int[] numbers = new int[arrSize];
        for(int i=0; i<arrSize; i++) {
            System.out.println(i+1);
            numbers[i] = sc.nextInt();
        }
        int[] newArray = new int[arrSize];
        for(int i=0; i<arrSize; i++)
        {
            if(i == arrSize-1) {
                newArray[0] = numbers[i];
            }
            else {
                newArray[i+1] = numbers[i];
            }
        }
        for(int i : newArray)
        {
            System.out.print(i + " ");
        }


    }
}
