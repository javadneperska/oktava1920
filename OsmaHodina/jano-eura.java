package sk.gymbosak;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {    
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadaj sumu:");
        float suma = sc.nextFloat();
        int bankovky = 0;
        int mince = 0;
        float[] ikr = { 500, 200, 100, 50, 20, 10, 5, 2, 1, 0.5f, 0.2f, 0.1f, 0.05f, 0.02f, 0.01f };
        for(float idk : ikr)
        {
            while((suma-idk) >= 0)
            {
                suma = suma-idk;
                if(idk > 2) {
                    bankovky++;
                    System.out.println("bankovka " + idk);
                } else {
                    mince++;
                    System.out.println("minca " + idk);
                }

            }
        }
        System.out.println("bankoviek: " + bankovky + " minci: " + mince);
    }
}
