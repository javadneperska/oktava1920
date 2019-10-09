package sk.dneperska;

public static void main(String[] args)
{
    String lipsum = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.";
    int acka = 0;
    for(int i = 0; i < lipsum.length(); i++)
    {
        if(f.charAt(i) == 'a' || f.charAt(i) == 'A')
            acka++;
    }
    System.out.println("Pocet a: " + acka);
    System.out.println("Prve a index: " + lipsum.indexOf("a"));
}
