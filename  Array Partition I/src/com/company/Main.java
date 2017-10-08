package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int [] test={1,4,3,2};
        if(arrayPairSum(test)==4)
           System.out.println("RIGHT");
    }

    public static int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int Pairminsum=0;
        for(int i=0;i< nums.length;i=i+2)
            Pairminsum=Pairminsum+nums[i];
        return Pairminsum;

    }
}
