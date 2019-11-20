private static void fhodina9_1_Sort()
    {
        int[] a = new int[10];
        System.out.println(">");
        for (int i =0;i<10;i++)
        {
            a[i] = sc.nextInt();
        }
        fbubbleSort(a);
    }

    private static void fbubbleSort(int[] daco)
    {
        int n = daco.length;
        int temp = 0;
        for(int i=0; i < n; i++)
        {
            for(int j=1; j < (n-i); j++)
            {
                if(daco[j-1] < daco[j]){
                    //swap elements
                    temp = daco[j-1];
                    daco[j-1] = daco[j];
                    daco[j] = temp;
                }

            }
        }
        fvypis(daco);


    }
    private static void fvypis(int[] a)
    {
        for(int i =0;i<a.length;i++)
        {
            System.out.print(a[i] + " ");
        }
    }
