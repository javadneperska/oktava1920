package com.company;

import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
while(true){
        System.out.println("1 = Rimske --> Arabske");
        System.out.println("2 = Arabske --> Rimske");

        int x = sc.nextInt();

        if(x == 1){
            System.out.println("zadajte rimske cislo: ");
            String input = sc.next().toUpperCase();

            HashMap<Character, Integer> rimskecislo = new HashMap<Character, Integer>();
            rimskecislo.put('I', 1);
            rimskecislo.put('V', 5);
            rimskecislo.put('X', 10);
            rimskecislo.put('L', 50);
            rimskecislo.put('C', 100);
            rimskecislo.put('D', 500);
            rimskecislo.put('M', 1000);

            int sum = 0;

            for (int i = 0; i <input.length(); i++) {
                int a = rimskecislo.get(input.charAt(i));
                if (rimskecislo.get(input.charAt(i + 1)) > a) {
                    i++;
                    int b = rimskecislo.get(input.charAt(i));
                    sum += (b - a);
                } else
                    sum += a;
            }

            System.out.println(input + " --> " + sum);

        }

        if(x == 2){
            System.out.println("zadajte cislo:");
            int inputcislo = sc.nextInt();

            TreeMap<Integer, String> cislo = new TreeMap<Integer,String>();
            cislo.put(1000, "M");
            cislo.put(900, "CM");
            cislo.put(500, "D");
            cislo.put(400, "CD");
            cislo.put(100, "C");
            cislo.put(90, "XC");
            cislo.put(50, "L");
            cislo.put(40, "XL");
            cislo.put(10, "X");
            cislo.put(9, "IX");
            cislo.put(5, "V");
            cislo.put(4, "IV");
            cislo.put(1, "I");

            String sum2 = "";
            int abc = inputcislo;
            while(true)
            {
                int l =  cislo.floorKey(inputcislo);
                if ( inputcislo == l ) {
                    sum2 += cislo.get(l);
                    break;
                }
                sum2 += cislo.get(l);
                inputcislo -= l;
            }
            System.out.println(abc + " --> " + sum2 );

        }
         System.out.println();
     }
    }
}
