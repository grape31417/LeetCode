package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public int[][] matrixReshape(int[][] nums, int r, int c) {

        int n = nums.length;
        int m = nums[0].length;
        if(n*m!= r*c)
            return nums;

        int resultArray [][]= new int[r][c];
        for (int i=0;i<r*c;i++)
            resultArray[i/c][i%c] = nums[i/m][i%m];

            return resultArray;



        }

    }
}
}
