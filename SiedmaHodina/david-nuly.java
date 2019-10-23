package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        ArrayList<Integer> finalArr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(6);
        arr.add(3);
        arr.add(4);
        arr.add(1);
        arr.add(7);
        arr.add(8);
        arr.add(1);
        arr.add(2);
        arr.add(0);
        arr.add(3);
        arr.add(4);
        arr.add(0);
        arr.add(0);
        arr.add(8);
        arr.add(9);
        arr.add(0);
        arr.add(4);
        arr.add(5);
        arr.add(1);
        int zeros = 0;
        for(int i=0; i<arr.size(); i++)
        {
            if(arr.get(i) == 0)
            {
                zeros ++;
            }
            else {
                finalArr.add(arr.get(i));
            }
        }
        for(int i=0; i<zeros; i++)
        {
            finalArr.add(0);
        }
        for(int i : finalArr)
        {
            System.out.print(i + " ");
        }
    }
}
