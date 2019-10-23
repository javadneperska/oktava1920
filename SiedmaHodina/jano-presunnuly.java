package sk.gymbosak;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {        
        int[] input = {8,7,4,0,2,4,5,0,1,3,0};
        int[] sorted = new int[input.length];
        int j = 0;
        for(int i=0;i<input.length;i++)
        {
            if(input[i]!= 0)
            {
                sorted[id] = input[i];
                id++;
            }
            else
            {
                sorted[input.length-j] =0;
            }
        }
        System.out.println(Arrays.toString(sorted));
    }
}
