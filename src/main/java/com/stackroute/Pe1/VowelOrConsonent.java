package com.stackroute.Pe1;

public class VowelOrConsonent {
    public static String isVowel(String s)
    {
        String str="";
        for (int i = 0; i <= s.length() - 1; i++)
        {
            char c = s.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
            {
                System.out.println("given input is a vowel:" + c);
                str=" given input is a vowel:";

            }
            else {
                System.out.println("given input is a consonent:" + c);
                str= "given input is a consonent:";
            }
        }
        return str;


    }
}

