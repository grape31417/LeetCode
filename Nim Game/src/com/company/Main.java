package com.company;

public class Main {

    public static boolean test(int input)
    {
        if (canWinNim(input)==true)
            return true;
        return false;
    }

    public static void main(String[] args) {

        int input=5;
        if (test(input)==true)
            System.out.println("WIN");
        else
            System.out.println("lose");
    }

    public static boolean canWinNim(int n) {
        if(n<4)//一次全拿
            return true;
        if (n%4==0)//4的倍數 只要留給自己的顆數為4的倍數則一定輸 5-1=4 6-2=4 7-3=4
            return false;
        else
            return true;




    }
}
