package sk.gymbosak;

public class Main {

    public static void main(String[] args) {
        int l = 0;
        ArrayList<Integer> vysledky = new ArrayList<Integer>();
        for(int i=1; i<10000; i++)
        {
            int k = 0;
            for(int j=1; j<i; j++)
            {
                if(i % j == 0) {
                    k++;
                }
            }
            if(k > l)
            {
                l = k;
                vysledky.clear();
            }
            if(k == l)
            {
                vysledky.add(i);
            }
        }
        for(int i : vysledky)
        {
            System.out.println(i);
        }
    }
}
