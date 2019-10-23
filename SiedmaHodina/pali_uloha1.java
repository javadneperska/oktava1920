package sk.dneperska;

public class Main 
{
fhodina7_1();


}

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
public class Delitele
{
    public int number;
    public int delitele;

    public Delitele(int n)
    {
        delitele = getDelitel(n);
        number = n;
    }

    private static int getDelitel(int n)
    {
        int result = 0;

        for(int i = 1;i<=n;i++)
        {
            if(n%i == 0)result++;
        }

        return result;
    }
}
