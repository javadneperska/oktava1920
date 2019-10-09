private static  Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
	    // write your code here
        int[] pole;
        int velkost = 0;
        System.out.println("Zadaj velkost pola> ");
        velkost = sc.nextInt();
        pole = new int[velkost];
        int moznost = 0;

        for(int i =0;i<velkost;i++)
        {
            System.out.println("Zadaj prvok pola> ");
            pole[i] = sc.nextInt();
        }

        System.out.println("Ktoru moznost chces? ");
        System.out.println("1. Zisti na kt. indexe je tvoje cislo");
        System.out.println("2. Prepis indexu");
        System.out.println("3. vymazat index");
        System.out.println("zadaj moznost> ");
        moznost = sc.nextInt();

        switch (moznost)
        {
            case 1:
                fuloha1(pole);
                break;
            case 2:
                fuloha2(pole);
                break;
            case 3:
                pole = fuloha3(pole);
                break;
        }
        for(int i =0;i<pole.length;i++)
        {
            System.out.print(pole[i] + " ");
        }
    }
    
    private static void fuloha1(int[] pole)
    {

        int find;
        int id = -1;
        System.out.println("Zadaj prvok kt sa hlada> ");
        find = sc.nextInt();

        for(int i =0;i < pole.length;i++)
        {
            if(pole[i] == find) id = i;
        }

        if(id == -1)
        {
            System.out.println("Zadane cislo neni v poli.");
        }
        else
        {
            System.out.println("Zadane je na indexe " + id);
        }

    }
    private static void fuloha2(int[] pole)
    {

        int[] npole = new int[pole.length-1];
        int id = 0;
        int nvalue = 0;
        System.out.println("Ktory index prepisat> ");
        id = sc.nextInt();
        System.out.println("Hodnota na prepis> ");
        nvalue = sc.nextInt();

        if(id < pole.length)pole[id] = nvalue;

    }
    private static int[] fuloha3(int[] pole)
    {
        int[] result = new int[pole.length - 1];
        int index = 0;
        System.out.println("Ktory index chces vymazat>");
        index = sc.nextInt();
        for (int i = 0, k = 0; i < pole.length; i++)
        {
            if (i == index) {
                continue;
            }
            result[k++] = pole[i];
        }
        return result;
    }
