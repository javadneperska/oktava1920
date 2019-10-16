package sk.dneperska;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("cislo 1:");

        double val1 = sc.nextDouble();
        System.out.println("cislo 2:");

        double val2 = sc.nextDouble();
        System.out.println(val1 + val2);

        System.out.println(val1 - val2);

        System.out.println(val1 * val2);

        System.out.println(val1 / val2);
    }
}