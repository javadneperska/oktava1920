package sk.gymbosak;

public class Main {

    public static void main(String[] args) {
        for(int i=0; i<3; i++)
            if(i == 0)
                for(int j=0; j<6; j++)
                    if(j == 5)
                        System.out.print("\n");
                    else if(j == 2)
                        System.out.print("*");
                    else System.out.print(" ");
            else if(i == 1)
                for(int j=0; j<6; j++)
                    if(j == 5)
                        System.out.print("\n");
                    else if(j == 1 || j == 3)
                        System.out.print("*");
                    else System.out.print(" ");
            else if(i == 2)
                for(int j=0; j<6; j++)
                    if(j == 5)
                        System.out.print("\n");
                    else if(j == 0 || j == 4)
                        System.out.print("*");
                    else System.out.print(" ");
        for(int i=0; i<5; i++)
            if(i == 0 || i == 4)
                for(int j=0; j<6; j++)
                    if(j == 5)
                        System.out.print("\n");
                    else System.out.print("*");
            else for(int j=0; j<6; j++)
                if(j == 5)
                    System.out.print("\n");
                else if(j == 0 || j == 4)
                    System.out.print("*");
                else System.out.print(" ");
    }
}
