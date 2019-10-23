
package sk.dneperska;
public static void main(String[] args)
    {
	    // write your code here
        fhodina7_3();

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
