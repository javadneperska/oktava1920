package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        {

            Scanner sc = new Scanner(System.in);
            System.out.println("zadaj cislo a");
            int a = sc.nextInt();
            int pomocnecislo = 0;
            for (int i = (a - 1); i > 1; i--){
                if(a%i==0)
                {
                    System.out.println("neni prvocislom");
                    pomocnecislo++;
                }
                else {

                if(pomocnecislo==0) {
                    System.out.println("je prvocislom");
                } }
                }}}}