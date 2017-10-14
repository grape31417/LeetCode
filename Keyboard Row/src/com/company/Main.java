package com.company;

public class Main {

    public static boolean Test1()
    {
        String[] arrStrTestInput = new String[4];
        arrStrTestInput[0]= "Hello";
        arrStrTestInput[1]= "Alaska";
        arrStrTestInput[2]= "Dad";
        arrStrTestInput[3]= "Peace";

        String[] rightResult;
        rightResult=findWords(arrStrTestInput);

        System.out.printf("%d %n",rightResult.length);
        if(rightResult.length!=2)
            return false;
        if(rightResult[0]!="Alaska"||rightResult[1]!="Dad")
            return false;
        return true;


     }

    public static void main(String[] args) {
        if(Test1()==true)
            System.out.println("right");


	// write your code here
    }
    public static String[] findWords(String[] words) {
        char[] row1={'q','w','e','r','t','y','u','i','o','p','Q','W','E','R','T','Y','U','I','O','P'};
        char[] row2={'a','s','d','f','g','h','j','k','l','A','S','D','F','G','H','J','K','L'};
        char[] row3={'z','x','c','v','b','n','m','Z','X','C','V','B','N','M'};
        String[] result;


C[]
        C[]
        Array<C>

        for (String word:words)
        {
            for(int i=0;i<word.length();i++) {
                int row1Flag=0;
                int row2Flag=0;
                int row3Flag=0;
                char ch;
                ch = word.charAt(i);

                for (char c : row1)
                    if (c == ch)
                        row1Flag = 1;
                for (char c : row2)
                    if (c == ch)
                        row2Flag = 1;
                for (char c : row3)
                    if (c == ch)
                        row3Flag = 1;
                if (row1Flag+row2Flag+row3Flag==1)
            }

        }
       words=null;
        return words;




    }
}
