package sk.gymbosak;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Znak:");
        charFind(sc.next());
    }

    private static void charFind(String input)
    {
        String loremIpsum = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
        int d = loremIpsum.lastIndexOf(input);
        char ch = input.charAt(0);
        int count = 0;
        for(int i = 0;i<loremIpsum.length();i++)
        {
            if(ch == loremIpsum.charAt(i)){
                count ++;
                System.out.println(i);
            }
        }
        System.out.println("najdene " + count + "x");
    }

}
