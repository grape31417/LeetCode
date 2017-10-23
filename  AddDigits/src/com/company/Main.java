package com.company;

public class Main {

    public static boolean test (int input)
    {
        if(addDigits(input)==2)return true;
        return false;
    }
    public static void main(String[] args) {
        int input=3251;
        if(test(input)==true)
            System.out.printf("right");

    }
    public static int addDigits(int num) {
        if(num<10)return num;

        int result=0;
        while(num>=10) {
            result=0;
            while (num>=10) {
                result = result + num % 10;
                num /= 10;
            }
            result=num+result;
            num=result;
        }
            return result;

    }
}
