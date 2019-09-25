
import java.util.Scanner;

public class Pocitadlo
{
    private double number1,number2;
    private Scanner sc;
    private  int c;

    public Pocitadlo()
    {
        number1 = 0;
        number2 = 0;
        sc = new Scanner(System.in);
        c = ' ';
    }

    public void Zadaj()
    {
        System.out.println("Zadaj cislo 1> ");
        number1 = sc.nextDouble();
        System.out.println("Zadaj cislo 2> ");
        number2 = sc.nextDouble();
        System.out.println("Zadaj operaciu 1 + 2 - 3 * 4 / > ");
        c = sc.nextInt();

        System.out.println("Vysledok je : "+Pocitaj());

    }

    private double Pocitaj()
    {
        switch (c)
        {
            case 1:
                    return number1+number2;

            case 2:
                    return number1-number2;

            case 3:
                    return number1*number2;

            case 4:
                    return number1/number2;

            default:
                System.out.println("Zly vstup");
                return 1;

        }

    }



}
