package com.company;

public class Main {

    public static void main(String[] args) {
        int inputa=10;
        int inputb=2;
	if(getSum(inputa,inputb)==12)
	    System.out.printf("right");
    }

        public static int getSum(int a, int b) {
            int result = 0;
            result = a + b;
            return result;
        }
}
