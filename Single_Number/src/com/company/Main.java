package com.company;

public class Main {
    public static boolean test(int[] input)
    {
        int answer=-1;
        System.out.println(singleNumber(input));
        if(singleNumber(input)==answer)
        return true;
        return false;

    }

    public static void main(String[] args) {
	int[] input={1,3,1,3,-1};
	if (test(input)==true)
	    System.out.println("RIGHT");
    }

    public static int singleNumber(int[] nums) {
        int result=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            result=result^nums[i];//XOR運算特性 只要一樣的就是0
        }
        return result;
    }
}
