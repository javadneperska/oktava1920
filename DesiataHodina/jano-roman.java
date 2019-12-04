package sk.dneperska;

import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter roman:");
        String in = sc.nextLine().toUpperCase();
        HashMap<Character, Integer> romans = new HashMap<Character, Integer>();
        romans.put('I', 1);
        romans.put('V', 5);
        romans.put('X', 10);
        romans.put('L', 50);
        romans.put('C', 100);
        romans.put('D', 500);
        romans.put('M', 1000);
        int num = 0;
        for(int i = 0; i < in.length(); i++)
        {
            int val = romans.get(in.charAt(i));
            if(romans.get(in.charAt(i + 1)) > val)
            {
                i++;
                int val2 = romans.get(in.charAt(i));
                num += (val2 - val);
            }
            else
                num += val;
        }
        System.out.println("Value: " + num);

        System.out.println("Enter arabic number:");
        int in2 = sc.nextInt();
        TreeMap<Integer, String> romans2 = new TreeMap<Integer,String>();
        romans2.put(1000, "M");
        romans2.put(900, "CM");
        romans2.put(500, "D");
        romans2.put(400, "CD");
        romans2.put(100, "C");
        romans2.put(90, "XC");
        romans2.put(50, "L");
        romans2.put(40, "XL");
        romans2.put(10, "X");
        romans2.put(9, "IX");
        romans2.put(5, "V");
        romans2.put(4, "IV");
        romans2.put(1, "I");
        String num2 = "";
        while(true)
        {
            int l =  romans2.floorKey(in2);
            if ( in2 == l ) {
                num2 += romans2.get(l);
                break;
            }
            num2 += romans2.get(l);
            in2 -= l;
        }
        System.out.println("Roman: " + num2);
    }
}
