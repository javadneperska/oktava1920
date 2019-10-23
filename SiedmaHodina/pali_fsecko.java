private static void fhodina7_1()
    {
        List<Delitele> list = new ArrayList<>();

        for(int i = 1;i<=10000;i++)
        {
            list.add(new Delitele(i));
        }

        int max = 5;
        int n = 10;

        for (int i =0;i<list.size();i++)
        {
            if (list.get(i).delitele > max)
            {
                n = list.get(i).number;
                max = list.get(i).delitele;
            }

        }
        for (int i =0;i<list.size();i++)
        {
            if (list.get(i).delitele == max)
            {
                System.out.println(list.get(i).number+" " + list.get(i).delitele);
            }
        }

    }
    private static void fhodina7_2()
    {
        int g =0;
        for (int i=1;i<=10000;i++)
        {
            if ((getDelitelSum(i)/2) <= i){ System.out.println(i);g++;}
        }
        System.out.println(g);
    }
    private static int getDelitelSum(int n)
    {
        int result = 0;

        for(int i = 1;i<=n;i++)
        {
            if(n%i == 0)result+=i;
        }

        return result;
    }

    private static void fhodina7_3()
    {
        int[] list = {1,2,3,0,6,0,7,0,9,10};
        int[] list2 = new int[list.length];

        int id = 0;
        for(int i=0;i<list.length;i++)
        {
            if(list[i]!= 0)
            {
                list2[id] = list[i];
                id++;
            }
            else
            {
                list2[list.length-id] =0;
            }
        }
        System.out.println(Arrays.toString(list2));
    }
    private static void fhodina7_4(int a,int b)
    {
        System.out.println("Obsah: " + (a*b));
        System.out.println("Obvod: " + (2*(a+b)));
    }

    private static void fhodina7_5()
    {
        int[] list = new int[5];
        for(int i =0;i<5;i++)
        {
            System.out.println("zadaj cislo: ");
            list[i] = sc.nextInt()+1;
        }
        System.out.println(Arrays.toString(list));

    }
