package sk.dneperska;

 public static void main(String[] args)
    {
        froof(5);
        fhouse(7);
    }
    
    private static void froof(int f)
    {
        int start = 3;
        int space = 0;
        int c = 0;
        int y = 0;
        for(int i = 1; i < f; i++)
        {
            for(int j = 0; j <= f; j++)
            {
                if(i == 1 && j==(start))
                {

                    System.out.print("*");
                }
                else if (i >1)
                {
                    c = (start + space)-1;
                    y = start - space;
                    if(j == y || j==c)//|| j==c
                    {

                        System.out.print("*");
                    }
                }

                System.out.print(" ");
            }
            space += 1;
            System.out.println();
        }
    }
    private static void fhouse(int width)
    {
        for (int i = 1; i <= width;i++)
        {
            for(int j = 1; j <=width; j++)
            {
                if(i==1 || i == width)
                {
                    System.out.print("*");
                }
                else
                {
                    if (j == 1 || j == width)
                    {
                        System.out.print("*");
                    }
                    else
                    {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
