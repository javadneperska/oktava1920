package sk.dneperska;
import java.util.Scanner;

public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadaj index: ");
        int f = fibonaci(sc.nextInt());
        System.out.println("Na danom indexe je cislo: " + f);
    }
private static int fibonaci(int s)
    {
        int c1 = 1;
        int c2 = 1;
        int c3 = 2;
        for(int i =3;i<=s;i++)
        {
            c3 = c1+c2;
            c1 = c2;
            c2 = c3;
           // System.out.println(i + " - " + c3);
        }
        return c3;
    }
    
    
