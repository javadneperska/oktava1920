package sk.gymbosak;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {    
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadaj dlzku:");
        int length = sc.nextInt();
        int k = 0;
        for(int i =0;i<length;i++)
        {
            for(int j=0;j<k;j++)
            {
                System.out.print(" ");
            }
            k+=length;
            for(int j = 0;j<length;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
