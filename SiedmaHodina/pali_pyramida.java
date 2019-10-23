package sk.dneperska;

public static void main(String[] args)
    {
	    // write your code here
        //fhodina7_3();
        fpyramida(10);

    }


 private static void fpyramida(int width)
    {

        for (int i=0;i<width;i++)
        {
            for(int s = 0;s<i;s++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
