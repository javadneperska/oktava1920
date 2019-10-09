 public static void main(String[] args)
    {
    faverage();
    }


private static void faverage()
    {
        double[] avgs = new double[4];
        int[] ziak1 = {1,2,3,4,5,1};
        int[] ziak2 = {2,3,1,2,4,5,5};
        int[] ziak3 = {1,1,1,3,4,5,5};
        int[] ziak4 = {1,1,1,1,1};

        avgs[0] = favg(ziak1);
        avgs[1] = favg(ziak2);
        avgs[2] = favg(ziak3);
        avgs[3] = favg(ziak4);

        System.out.println("Najlepsi priemer ma " + fgetIndex(avgs));

    }
    private static double favg(int[] s)
    {
        double result = 0;
        for(int i = 0;i<s.length;i++)
        {
            result += s[i];
        }
        return result/s.length;
    }

    private static int fgetIndex(double[] s)
    {
        double d = s[0];
        int id = 0;
        for (int i =1;i<s.length;i++)
        {
            if(s[i] < d){d = s[i];id = i;}
        }
        return id;
    }
