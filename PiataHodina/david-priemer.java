package sk.gymbosak;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        int[] firstStudent =
                {
                        1,
                        3,
                        2,
                        2,
                        1
                };
        int[] secondStudent =
                {
                        4,
                        5,
                        3,
                        1,
                        2
                };
        int[] thirdStudent =
                {
                        3,
                        2,
                        4,
                        1,
                        3
                };
        if(returnAverage(firstStudent) < returnAverage(secondStudent) || returnAverage(firstStudent) < returnAverage(thirdStudent))
            System.out.println("prvy ziak ma najlepsi: " + returnAverage(firstStudent));
        else if(returnAverage(secondStudent) < returnAverage(firstStudent) || returnAverage(secondStudent) < returnAverage(thirdStudent))
            System.out.println("druhy ziak ma najlepsi: " + returnAverage(secondStudent));
        else if(returnAverage(thirdStudent) < returnAverage(secondStudent) || returnAverage(thirdStudent) < returnAverage(firstStudent))
            System.out.println("treti ziak ma najlepsi: " + returnAverage(thirdStudent));
        else{
            System.out.println("niekto ma rovnaky");
        }
    }

    public static float returnAverage(int[] grades)
    {
        int counted = 0;
        for(int g : grades)
        {
            counted = g + counted;
        }
        return (float) counted/grades.length;
    }
}
