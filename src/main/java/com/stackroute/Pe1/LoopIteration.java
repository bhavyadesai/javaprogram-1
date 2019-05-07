package com.stackroute.Pe1;

public class LoopIteration {
    public static String findIteration(int num) {
        String output ="";
        if (num <= 0 )
        {
            output="iteration not done";
        }
        else {
            for (int i = 1; i <= num; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(i);
                    output = "iteration done";
                }
            }
        }


        return output;

    }
}

