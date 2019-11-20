private static void fhodina9_2_HadajCislo()
    {
        Random r = new Random();
        int a = r.nextInt(19) + 1;
        int lives = 5;
        int f = 0;

        for(int i =lives;i>0;i--)
        {
            System.out.println("Pocet pokusov: " + i);
            System.out.println("Hadaj cislo> ");
            f = sc.nextInt();

            if(f > a)
            {
                System.out.println("Moje cislo je mensie");

            }
            else if (f< a )
            {
                System.out.println("Moje cislo je vecsie");
            }
            else
            {
                System.out.println("Uhadol si, moje cislo bolo " + a);
                return;
            }


        }
