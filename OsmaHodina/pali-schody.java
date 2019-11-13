 
 private static void fhodina8_1_Schody(int length)
    {
        int h = 0;
        for(int i =0;i<length;i++)
        {
            for(int j=0;j<h;j++)
            {
                System.out.print(" ");
            }
            h+=length;
            for(int j = 0;j<length;j++)
            {
                System.out.print("*");
            }
            System.out.println();

        }
    }
