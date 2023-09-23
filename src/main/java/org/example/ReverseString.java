package org.example;

public class ReverseString {
    public static String ReverseString (String str) {

        char ch;
        String nstr = "";

        for (int i=0; i<str.length(); i++)
        {
            ch= str.charAt(i); //extracts each character
            nstr= ch+nstr; //adds each character in front of the existing string
        }
        return(nstr);
    }
}
