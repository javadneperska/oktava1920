package sk.dneperska;
import java.util.Scanner;

public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadaj znak: ");
        fStringFind(sc.next());
    }
    
    private static void fStringFind(String a)
    {
        String f = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
        int d = f.lastIndexOf(a);
        char g = a.charAt(0);
        System.out.println(d);
        for(int i = 0;i<f.length();i++)
        {
            if(g == f.charAt(i)){
                System.out.println(i);
            }
        }
    }
