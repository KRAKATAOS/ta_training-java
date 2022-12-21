package com.epam.training.student_Konstantin_Belin.classes.MaxMethod;

import static java.lang.Integer.MAX_VALUE ;
import static java.lang.Integer.MIN_VALUE ;


public class MaxMethod {
    public static void main(String[] args){

        int[] array = new int []{-10, 3, 255528, 0, Integer.MAX_VALUE, 100, 0};

        System.out.println(max(array));

    }
    public static int max(int[] values) {
       /* throw new UnsupportedOperationException();*/
        int max = values[0];
        for(int i=0; i<values.length; i++)
        {
            if(max<values[i])
            {
                max=values[i];
            }

        }

        return max;
    }

}

