package com.company;
import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

    }
    class Solution {
        public  int calPoints(String[] ops) {
            int result=0;
            int lastsum=0;
            int lastget=0;
            int secondget=0;
            int thirdget=0;
            int sum=0;


            for (String op : ops) {
                if (op.equals("+")) {
                    result = sum + lastget + secondget;
                    //thirdget=secondget;
                    //secondget=lastget;
                    //lastget=lastget+secondget;
                    lastsum =sum;
                    sum = result;
                }
                else if (op.equals("C")) {
                    result = lastsum;
                    lastsum =sum;
                    sum = result;
                    lastget=secondget;
                    secondget=thirdget;
                }
                else if (op.equals("D")) {
                    result = sum + lastget * 2;
                    lastsum = sum;
                    sum = result;
                }
                else {
                    result = sum + Integer.parseInt(op);
                    thirdget=secondget;
                    secondget = lastget;
                    lastget = Integer.parseInt(op);
                    lastsum = sum;
                    sum = result;
                }
            }

                return result;


        }
    }
}
