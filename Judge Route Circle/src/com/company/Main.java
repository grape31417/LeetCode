package com.company;

public class Main {

    public static void main(String[] args) {
	if(judgeCircle ("UD")==true)
        System.out.println("RIGHT");
    }

        public static boolean judgeCircle(String moves) {
            int x=0;
            int y=0;
            for(char sw:moves.toCharArray()) {

                if (sw == 'L')
                    x = x - 1;
                if (sw == 'R')
                    x = x + 1;
                if (sw == 'U')
                    y = y + 1;
                if (sw == 'D')
                    y = y - 1;
            }

            return x==0&&y==0;
        }


}
