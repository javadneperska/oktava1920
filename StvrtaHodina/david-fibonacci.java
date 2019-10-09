package sk.gymbosak;

public class Main {

    public static void main(String[] args) {
        WriteOutFibonacci();
    }

    public static void WriteOutFibonacci()
    {
        int n1 = 0;
        int n2 = 1;
        for(int i=1; i<=10; i++)
        {
            int n3 = n1+n2;
            System.out.println(n1);
            n1 = n2;
            n2 = n3;
        }
    }
}
