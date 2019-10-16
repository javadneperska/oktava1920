package sk.dneperska;
import java.util.Scanner;

public class Main {
            public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

          int[] cislo = new int[10];
            for(int i=0; i<10; i++) {
                System.out.println(" hodnota " + i + ":");
                cislo[i] = sc.nextInt();
            }

            for(int cislo1 : cislo)
            {
                if((cislo1 % 3 == 0 || cislo1 % 4 == 0) && cislo1 != 0)
                {
                    System.out.println(cislo1);
                }
            }

        }
    }