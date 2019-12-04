package sk.dneperska;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadaj sirku:");
        int sirka = sc.nextInt();
        System.out.println("Zadaj vysku:");
        int vyska = sc.nextInt();
        System.out.println("Zadaj dlzku:");
        int dlzka = sc.nextInt();
        int[] plocha = new int[sirka * vyska];


        for(int i = 0; i < vyska; i++)
        {
            System.out.print("|");
            for(int j = 0; j < sirka; j++)
            {
                char c = ' ';
                if(plocha[j + i * vyska] == 1)
                    c = 'X';
                if(plocha[j + i * vyska] == 2)
                    c = 'O';
                System.out.print(c + "|");
            }
            System.out.println();
        }

        int g = 0;
        boolean side = false;
        while(g < sirka * vyska)
        {
            System.out.println("Zadaj x:");
            int x = sc.nextInt();
            System.out.println("Zadaj y:");
            int y = sc.nextInt();
            plocha[x + y * sirka] = side ? 1 : 2;
            side = !side;

            for(int i = 0; i < vyska; i++)
            {
                System.out.print("|");
                for(int j = 0; j < sirka; j++)
                {
                    char c = ' ';
                    if(plocha[j + i * vyska] == 1)
                        c = 'X';
                    if(plocha[j + i * vyska] == 2)
                        c = 'O';
                    System.out.print(c + "|");
                }
                System.out.println();
            }

            for(int start_x = 0; start_x <= (sirka - dlzka); start_x++)
            {
                for(int start_y = 0; start_y < vyska; start_y++)
                {
                    int a = plocha[start_x + start_y * sirka];
                    boolean found = true;
                    for(int i = 0; i < dlzka; i++)
                    {
                        if(plocha[start_x + i + start_y * sirka] != a) {
                            found = false;
                            break;
                        }
                    }
                    if(found)
                    {
                        if(a == 1)
                            System.out.println("Vyhral X");
                        if(a == 2)
                            System.out.println("Vyhral O");
                        if(a != 0)
                            return;
                    }
                }
            }
            for(int start_x = 0; start_x < sirka; start_x++)
            {
                for(int start_y = 0; start_y <= (vyska - dlzka); start_y++)
                {
                    int a = plocha[start_x + start_y * sirka];
                    boolean found = true;
                    for(int i = 0; i < dlzka; i++)
                    {
                        if(plocha[start_x + (start_y + i) * sirka] != a) {
                            found = false;
                            break;
                        }
                    }
                    if(found)
                    {
                        if(a == 1)
                            System.out.println("Vyhral X");
                        if(a == 2)
                            System.out.println("Vyhral O");
                        if(a != 0)
                            return;
                    }
                }
            }
            for(int start_x = 0; start_x <= (sirka - dlzka); start_x++)
            {
                for(int start_y = 0; start_y <= (vyska - dlzka); start_y++)
                {
                    int a = plocha[start_x + start_y * sirka];
                    boolean found = true;
                    for(int i = 0; i < dlzka; i++)
                    {
                        if(plocha[start_x + i + (start_y + i) * sirka] != a) {
                            found = false;
                            break;
                        }
                    }
                    if(found)
                    {
                        if(a == 1)
                            System.out.println("Vyhral X");
                        if(a == 2)
                            System.out.println("Vyhral O");
                        if(a != 0)
                            return;
                    }
                }
            }
            for(int start_x = 0; start_x <= (sirka - dlzka); start_x++)
            {
                for(int start_y = vyska - 1; start_y >= dlzka - 1; start_y--)
                {
                    int a = plocha[start_x + start_y * sirka];
                    boolean found = true;
                    for(int i = 0; i < dlzka; i++)
                    {
                        if(plocha[start_x + i + (start_y - i) * sirka] != a) {
                            found = false;
                            break;
                        }
                    }
                    if(found)
                    {
                        if(a == 1)
                            System.out.println("Vyhral X");
                        if(a == 2)
                            System.out.println("Vyhral O");
                        if(a != 0)
                            return;
                    }
                }
            }
            g++;
        }
    }
}
