public static boolean isPrime(int num)
    {
        for(int i = num - 1; i > 1; i--)
        {
            if (num % i == 0)
                return false;
        }
        return true;
    }
    
    public static void Main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            System.out.println("Zadajte cislo (0=koniec):");
            int cislo = sc.nextInt();
            if(cislo == 0)
                break;
            if(isPrime(cislo))
            {
                System.out.println("Je to prvocislo.");
            }
            else
            {
                System.out.println("Nieje to prvocislo");
            }
        }
    }
