package sk.gymbosak;

public class Main {

    public static void main(String[] args) {
        for(int i = 0; i < 4; i++)
        {
            int j = 3 - i;
            for(int k = 0; k < j; k++)
                System.out.print(" ");
            System.out.print("*");
            int l = (i * 2) - 2;
            for(int k = 1; k < l; k++)
                System.out.print(" ");
            if(i != 1)
                System.out.print("*");
            System.out.println();
        }
        for(int i = 0; i < 5; i++)
        {
            System.out.print("*");
        }
        System.out.println();
        for(int i = 0; i < 3; i++)
        {
            System.out.print("*");
            for(int k = 0; k < 3; k++)
                System.out.print(" ");
            System.out.println("*");
        }
        for(int i = 0; i < 5; i++)
        {
            System.out.print("*");
        }
    }
}
