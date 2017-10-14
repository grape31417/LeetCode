package com.company;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static boolean test() {
        int [] candies = {1,1,2,2,3,3};
        if(distributeCandies(candies)==3)
        return true;
        return false;

    }

    public static int distributeCandies(int[] candies) {

        Arrays.sort(candies);
        Set candyset=new HashSet();
        for (int candy:candies)
        {
            candyset.add(candy);
        }
        return Math.min(candyset.size(), candies.length / 2);

    }

    public static void main(String[] args) {
	if(test()==true){
	    System.out.println("RIGHT");
    }
    }
}
