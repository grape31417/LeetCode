package com.company;

public class Main {
  public static  boolean test(int[][] input)
    {
        if (islandPerimeter(input)==16)return true;
        return false;

    }

    public static void main(String[] args) {//給定一個小島地圖 求邊界長
        int[][] input = {
                {0, 1, 0, 0},
                {1, 1, 1, 0},
                {0, 1, 0, 0},
                {1, 1, 0, 0}
        };
        if (test(input)==true)
            System.out.println("right");

    }

    public static int islandPerimeter(int[][] grid) {
        int result=0;
        for(int x=0;x<grid.length;x++)
            for (int y=0;y<grid[x].length;y++) {
            if (grid[x][y]==1) {
                result += 4;
                if (x != 0&&grid[x-1][y] == 1)result -= 2;
                if(y != 0&&grid[x][y-1] == 1)result -= 2;
            }
            }
            return result;


    }

}
