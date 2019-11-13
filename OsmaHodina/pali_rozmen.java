private static void fhodina8_2_Rozmen()
    {
        int[] list = {500,200,100,50,20,10,5,2,1};
        int[] cents = {50,20,10,5,2,1};
        int[] euro = {0,0,0,0,0,0,0,0,0};
        int[] centy = {0,0,0,0,0,0};
        System.out.println("zadaj cislo> ");
        //int vydavok = sc.nextInt();
        float vydavok = sc.nextFloat();
        //String s = sc.next();
        //vydavok *= 100;
        while(vydavok > 1)
        {
            for (int i = 0; i < list.length; ++i)
            {
                if (list[i] < vydavok || list[i] == vydavok)
                {
                    //System.out.print(list[i] + " ");
                    vydavok -=list[i];
                    euro[i]++;
                    break;
                }

            }
        }
        System.out.println("sdadda");
        if(vydavok % 1 !=0)
        {
            vydavok *= 100;
            vydavok = Math.round(vydavok);
            while(vydavok>0)
            {
                for (int i = 0; i < cents.length; ++i) {
                    if (cents[i] < vydavok || cents[i] == vydavok) {
                        //System.out.print(cents[i] + " ");
                        centy[i]++;
                        vydavok -= cents[i];
                        break;
                    }

                }
            }
        }
        System.out.println("eura");
        for (int i =0;i<list.length;i++)
        {
            System.out.println(list[i] + " " + euro[i]);
        }
        System.out.println("centy");
        for (int i =0;i<cents.length;i++)
        {
            System.out.println(cents[i] + " " + centy[i]);
        }

    }
