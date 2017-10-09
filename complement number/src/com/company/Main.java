package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
    public static int findComplement(int num) {

            int i = 0;
            int j = 0;

            while (i < num)
            {
                i += Math.pow(2, j);
                j++;
            }

            return i - num;
        }
    }

