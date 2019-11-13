 private static void fhodina8_3_ZistiPocet()
    {
        String sds = "gsdfhijsd;ios;ofh pohprucbyqioy389yhdhsiajhgchssfjkj;ksdjfashigasioahiofgaa YHIOC BIO";
        String f = sc.next();
        int count = 0;
        char a = f.charAt(0);
        for(int i =0;i<sds.length();i++)
        {
            if(sds.charAt(i) == a)count++;
        }
        System.out.println(count);

    }
