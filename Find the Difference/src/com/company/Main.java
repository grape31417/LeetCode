package com.company;

public class Main {
    public  static void test(String s,String t)
    {
        if(findTheDifference(s,t)=='a')System.out.println("RIGHT");

    }

    public static void main(String[] args) {

        String s="ab";
        String t="abc";
        test(s,t);
    }
    public static char findTheDifference(String s, String t) {
        char result=0;
        for (int i = 0; i < s.length(); i++) {
            result ^= s.charAt(i);
        }
        for (int i = 0; i < t.length(); i++) {
            result ^= t.charAt(i);
        }
         return result;

    }
}