package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
    public static List<String> fizzBuzz(int n) {
        ArrayList <String> list=new ArrayList<> ();
        for (int i=1;i<=n;i++)
        {
            if(i%15==0) list.add("FizzBuzz");
                else if(i%3==0)list.add("Fizz");
                    else if(i%5==0)list.add("Buzz");
                        else list.add(String.valueOf(i);
        }
        return list;

    }
}