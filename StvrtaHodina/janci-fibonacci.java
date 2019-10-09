private static int fibonaci(int index)
{
    int arg1=arg2=sucet=1;
    for(int i = 3; i <= index; i++)
    {
        sucet = arg1+arg2;
        arg1 = arg2;
        arg2 = sucet;
    }
    System.out.println(sucet);
    return sucet;
}
