package com.company;

public class Main {
    public static void test(String input)
    {
     if (detectCapitalUse(input)==true)
         System.out.println("RIGHT");
    }

    public static void main(String[] args) {

        String input="FlaG";
        test(input);
    }
    public static boolean detectCapitalUse(String word) {
        int count=0;
        boolean firstUp=false;
        boolean twoUp=false;

        for (int i=0;i<word.length();i++) {
            if(i==0&&word.charAt(0)<='Z')firstUp=true;
            if (word.charAt(i) <='Z') count++;
            if(count>1)twoUp=true;
        }

            if(firstUp==true&&count==1)return true;//第一大寫 其他小寫
            if(twoUp==true&&count==word.length())return true;//全大寫
            if(count==0)return true;//全小寫
            else  return false;
    }
}
