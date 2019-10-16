package sk.gymbosak;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[10];
        for(int i=0; i<10; i++) {
            System.out.println("hodnota " + i + ":");
            nums[i] = sc.nextInt();
        }

        for(int num : nums)
        {
            if((num % 3 == 0 || num % 4 == 0) && num != 0)
            {
                System.out.println(num);
            }
        }

    }
}
