package sk.gymbosak;

public class Main {

    public static void main(String[] args) {
        System.out.println(isPrime(5) ? "yep" : "nope");
        System.out.println(isPrime(20) ? "yep" : "nope");
        System.out.println(isPrime(3) ? "yep" : "nope");
        System.out.println(isPrime(1) ? "yep" : "nope");
    }

    public static boolean isPrime(int num)
    {
        if(num == 1 || num == 2) return true;
        if(num == 0) return false;
        for(int i=num-1; i>1; i--)
            if(num % i == 0)
                return false;
        return true;
    }
}
