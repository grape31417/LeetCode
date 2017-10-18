package com.company;

import java.util.Arrays;

public class Main {
    public static boolean test(int[]input1,int[]input2)
    {
        int[] answer={-1,3,-1};
        int[] result = nextGreaterElement(input1,input2);
        for(int z=0;z<result.length;z++)//檢查出來的結果
            System.out.printf("%d ",result[z]);
        if(Arrays.equals(answer,result)==true)
            return true;
        return false;

    }

    public static void main(String[] args) {
	int [] input1={4,1,2};
	int [] input2={1,3,4,2};
	if(test(input1,input2)==true)
	    System.out.printf("right");

    }

        public static  int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];
         for(int i=0;i<nums1.length;i++) {
             find:
             for (int j = 0; j < nums2.length; j++) {//找有無相等值
                 if (nums1[i] == nums2[j]) {
                     for (int y = j + 1; y < nums2.length; y++) {//找下一輪有無較大值
                         if (nums1[i] < nums2[y]) {
                             result[i] = nums2[y];
                             break find;
                         }
                     }
                     result[i]=-1;
                     break find;
                 }

             }
         }

        return result;
    }
}
