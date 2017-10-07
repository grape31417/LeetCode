package com.company;

public class Main {

    public static void main(String[] args) {
        if(hammingDistance(1577962638,1727613287)==16)
            System.out.println("RIGHT");

    }
    public static int hammingDistance(int x, int y) {

        int counter =0;
        int modx =0;
        int mody =0;

        while(x!=0||y!=0) {
            modx = x % 2;
            x = x / 2;

            mody = y % 2;
            y = y / 2;

            if (modx != mody)
                counter++;
        }


        return counter;
    }
}
