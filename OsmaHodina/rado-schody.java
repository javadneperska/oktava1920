package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("dlzka schodu");
        int size = sc.nextInt();
        for(int i=0; i<size; i++)
        {
            for(int k=i; k>0; k--) { 
            for (int j = size; j > 0; j--) {
            System.out.print(" ");
                }
            }
            for(int j=size; j>0; j--)
            {
                System.out.print("*");
            }
            System.out.println("");
        } }}
