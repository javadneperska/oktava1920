package sk.gymbosak;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> dokonale = new ArrayList<Integer>();

        for(int i=1; i<10000; i++)
        {
            int k = 0;

            for(int j=1; j<=i; j++)
            {
                if(i % j == 0)
                {
                    k = j+k;
                }
            }

            if(k/2 <= i)
            {
                dokonale.add(i);
            }
        }
        for(int i : dokonale)
        {
            System.out.println(i);
        }
    }
}
