package sk.gymbosak;

import java.util.Scanner;

public class Main {

    private static char[] characters = {'I','V','X','L','C','D','M'};
    private static int[] values = {1,5,10,50,100,500,1000};

    public static void main(String[] args) {
        if(characters.length == values.length) {
            System.out.println("Input:");
            Scanner sc = new Scanner(System.in);
            char[] romans = sc.nextLine().toUpperCase().toCharArray();
            System.out.println("Cislo je " + returnNumber(romans));
            System.out.println("Povodna verzia je " + returnRoman(returnNumber(romans)));
        } else System.out.println("error, tables not set correctly");
    }

    public static int returnNumber(char[] romans)
    {
        int result = 0;
        for(int i=0; i<romans.length; i++)
        {
            System.out.println("index " + i + ", char " + romans[i] + ", value " + getRomanValue(romans[i]));
            if(i+1 < romans.length) {
                boolean found = false;
                for(int j=i+1; j<romans.length; j++) {
                    if (getRomanValue(romans[j]) > getRomanValue(romans[i])) {
                        result -= getRomanValue(romans[i]);
                        found = true;
                    }
                }
                if(!found)
                    result += getRomanValue(romans[i]);
            } else result += getRomanValue(romans[i]);
        }
        return result;
    }

    public static String returnRoman(int number)
    {
        String result = "";
        for(int i=characters.length-1; i>=0; i--)
        {
            while(number-values[i] >= 0) {
                number-=values[i];
                result += characters[i];
            }
        }
        if(result.contains("VIIII"))
            result = result.replace("VIIII","IX");
        else if(result.contains("LXXXX"))
            result = result.replace("LXXXX","XC");
        else if(result.contains("DCCCC"))
            result = result.replace("DCCCC","MC");
        return result;
    }

    public static int getRomanValue(char roman)
    {
        for(int i=0; i<characters.length; i++)
        {
            if(characters[i] == roman)
                return values[i];
        }
        return 0;
    }
}
