package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("zadaj lubovolne slovo");
        Scanner sc = new Scanner(System.in);
        String odzadu = "";
      //  int z = sc.nextInt();
        String z = sc.nextLine();
        System.out.println("zadal si: "+z);
       for(int i=z.length(); i>0; i--)
       {
           odzadu = odzadu + z.toCharArray()[i-1];
       }
        System.out.println("text: " + odzadu);
        System.out.println("Znaky: " + z.length());
    }

    }

