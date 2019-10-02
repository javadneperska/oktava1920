package sk.gymbosak;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner kek = new Scanner(System.in);
        while(true){
            System.out.println("\n\n\ncislo:");
            int num = kek.nextInt();
            if(isPrime(num)){
                System.out.println(num + " je prvocislo");
            } else {
                System.out.println(num + " nie je prvocislo");
            }
        }
    }

    public static boolean isPrime(int num)
    {
        if(num == 1 || num == 2) return true;
        if(num == 0) return false;
        for(int i=num-1; i>1; i--)
            if(num % i == 0)
                return false;
        return true;
    }

}
