package sk.dneperska;

private static  Scanner sc = new Scanner(System.in);

public static void main(String[] args)
    {
	    // write your code here
        fu1();
        fu2();
        fu3();
        fu4();
        fu5();
        fu6();
        fu7();
        fu8();
    }
    
    private static void fu1()
    {
        System.out.println("Zadaj 2 cisla> ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("sucet = " +(a+b));
        System.out.println("rozdiel = " +(a-b));
        System.out.println("nasobenie = " +(a*b));
        System.out.println("delenie = " +(a/b));
    }
    private static void fu2()
    {
        System.out.println("zadaj rozsah> ");
        int a = sc.nextInt();
        int s = sc.nextInt();

        for (int i =a;i<=s;i++)
        {
            if(i%2==0) System.out.println(i);
        }

    }
    private static void fu3()
    {
        int[] list = new int[10];
        int a = 0;
        for (int i=0;i<10;i++)
        {
            System.out.println("zadaj cislo> ");
            a = sc.nextInt();
            list[i] = a;
        }
        for(int i =0;i<list.length;i++)
        {
            if(list[i]%3 == 0 || list[i]%4 == 0) System.out.println(list[i]);
        }
    }

    private  static void fu4()
    {
        System.out.println("zadaj cislo> ");
        int a = sc.nextInt();
        System.out.println(fact(a));
    }
    private static int fact(int n)
    {
        int result = 1;
        for(int i =1;i<=n;i++)
        {
            result *= i;
        }
        return result;
    }
    private static void fu5()
    {
        System.out.println("zadaj cislo> ");
        int a = sc.nextInt();
        if(fisPrime(a)){ System.out.println("prvocislo"); }
        else{ System.out.println("Zlozene");}

    }
    private static boolean fisPrime(int n)
    {

        for (int i = 2;i<=n/2;i++)
        {
            if(n%i == 0)
                return false;
        }
        return true;
    }

    private static void fu6()
    {
        System.out.println("zadaj mesiac (cislo) > ");
        int a = sc.nextInt();
        if((a>=1 && a<3)||a==12 )
        {
            System.out.println("zima");
        }
        else if(a>2 && a<6)
        {
            System.out.println("jar");
        }
        else if (a>5 && a < 9)
        {
            System.out.println("Leto");
        }
        else if (a>8 && a < 12)
        {
            System.out.println("jesen");
        }
    }

    private static void fu7()
    {
        System.out.println("zadaj slovo> ");
        String s = sc.nextLine();
        System.out.println("znaky: " + s.length());
        char[] f = s.toCharArray();

        for (int i = s.length()-1;i>=0;i--)
        {
            System.out.print(f[i]);
        }
    }
    private static int fu8()
    {
        int[] randNumbers = new int[20];
        Random r = new Random();

        System.out.println("hadaj cislo> ");
        int a = sc.nextInt();
        for (int i =0;i<randNumbers.length;i++)
        {
            randNumbers[i] = r.nextInt(1000);
            if(randNumbers[i] == a) {System.out.println("Je tu cislo kt. si chcel");return 0;}
        }

        System.out.println("cislo kt si zadal sa v poli nenachadza.");
        return 1;

    }
