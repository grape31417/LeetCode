package com.company;

public class Main {
    public static boolean test(String input1,String input2)
    {
        int answer=3;
        if (findLUSlength(input1,input2)==answer)
            return true;
        return false;
    }



    public static void main(String[] args) {
	String input1="aba";
	String input2="cdc";
	if(test(input1,input2))
    System.out.println("RIGHT");
    }

    public static int findLUSlength(String a, String b) {
    if(a.equals(b))return -1;
    else return Math.max(a.length(),b.length());

    }
}
