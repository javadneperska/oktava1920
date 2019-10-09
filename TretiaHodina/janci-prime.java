package sk.gymbosak;

public class Main {

    public static boolean isPrime(int num)
    {
        for(int i = num - 1; i > 1; i--)
        {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(4) ? "yes" : "no");
        System.out.println(isPrime(11) ? "yes" : "no");
        System.out.println(isPrime(9) ? "yes" : "no");
    }
}
