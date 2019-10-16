package sk.dneperska;
import java.util.Scanner;

public class Main {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                 System.out.println("zadaj lubovolne cislo: ");
                int A = scanner.nextInt();
                int B = A;
                if (A > 0) {
                    for (int i = (A-1); i > 0; i--) {
                        B=B*i;
                    }
                    System.out.println(B);
                }
            }
}
