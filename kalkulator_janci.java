package sk.gymbosak;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String expression = sc.nextLine();

        expression = expression.replaceAll("\\s+","");

        String[] tokens = expression.split("\\+|\\-|\\*|\\/");
        Pattern pattern = Pattern.compile("\\+|\\-|\\*|\\/");
        Matcher matcher = pattern.matcher(expression);

        ArrayList<String> stuff = new ArrayList<>();
        ArrayList<String> stuff2 = new ArrayList<>();
        stuff2.addAll(Arrays.asList(tokens));

        while(matcher.find())
        {
            stuff.add(matcher.group(0));
        }

        System.out.println("abc");

        while(true)
        {
            if(stuff2.size() == 1)
                break;
            boolean done = false;
            for(int i = 0; i < stuff.size(); i++)
            {
                if(stuff.get(i).equals("*"))
                {
                    int cislo1 = Integer.parseInt(stuff2.get(i));
                    int cislo2 = Integer.parseInt(stuff2.get(i + 1));
                    stuff2.set(i, ""+(cislo1 * cislo2));
                    stuff2.remove(i + 1);
                    stuff.remove(i);
                    done = true;
                    break;
                }
                if(stuff.get(i).equals("/"))
                {
                    int cislo1 = Integer.parseInt(stuff2.get(i));
                    int cislo2 = Integer.parseInt(stuff2.get(i + 1));
                    stuff2.set(i, ""+(cislo1 / cislo2));
                    stuff2.remove(i + 1);
                    stuff.remove(i);
                    done = true;
                    break;
                }
            }
            if(done)
                continue;
            for(int i = 0; i < stuff.size(); i++)
            {

                    if(stuff.get(i).equals("+"))
                    {
                        int cislo1 = Integer.parseInt(stuff2.get(i));
                        int cislo2 = Integer.parseInt(stuff2.get(i + 1));
                        stuff2.set(i, ""+(cislo1 + cislo2));
                        stuff2.remove(i + 1);
                        stuff.remove(i);
                        done = true;
                        break;
                    }
                    if(stuff.get(i).equals("-"))
                    {
                        int cislo1 = Integer.parseInt(stuff2.get(i));
                        int cislo2 = Integer.parseInt(stuff2.get(i + 1));
                        stuff2.set(i, ""+(cislo1 - cislo2));
                        stuff2.remove(i + 1);
                        stuff.remove(i);
                        done = true;
                        break;
                    }
            }
            if(stuff2.size() == 1)
                break;
        }

        System.out.println("Vysledok: " + stuff2.get(0));
    }
}
