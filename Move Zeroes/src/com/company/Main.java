package com.company;


public class Main {

    public static void main(String[] args) {
	// write your code here
    }

        public static void moveZeroes(int[] nums) {

        int counter=0;

        for (int i=0;i<nums.length;i++)//將非0往前搬
        {
            if(nums[i]!=0) {
                nums[counter] = nums[i];
                counter++;
            }
        }
        for (int i=counter;i<nums.length;i++)//剩下補0
        {
            nums[i]=0;
        }
        }
}
