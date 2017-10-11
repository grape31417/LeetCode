package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
    public static String[] findWords(String[] words) {
        char[] row1={'q','w','e','r','t','y','u','i','o','p','Q','W','E','R','T','Y','U','I','O','P'};
        char[] row2={'a','s','d','f','g','h','j','k','l','A','S','D','F','G','H','J','K','L'};
        char[] row3={'z','x','c','v','b','n','m','Z','X','C','V','B','N','M'};

        int row1Flag=0;
        int row2Flag=0;
        int row3Flag=0;
        String arr= String.valueOf(words);

        for (int i=1;i<=arr.length();i++)
        {
            char ch;
            ch = arr.charAt(i);


            for (char c:row1)
                if(c==ch)row1Flag=1;
            for (char c:row2)
                if(c==ch)row2Flag=1;
            for (char c:row3)
                if(c==ch)row3Flag=1;

        }
        if (row1Flag+row2Flag+row3Flag==1) words=null;
        return words;




    }
}
