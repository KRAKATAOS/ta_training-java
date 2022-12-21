package com.epam.training.student_Konstantin_Belin.classes.SumOfEvenNumbers;

public class SumOfEvenNumbers {
    public static void main(String[] args){

        int[] array = new int []{-2,10,0,5};

        System.out.println(sum(array));
}

    public static int sum(int[] array){

//put your code here
        int sum =0;
        if (array == null)
            return 0;
        for (int i = 0; i < array.length; i++)
        {
            if (array [i] % 2 == 0) {sum = sum + array [i];}
        }
        return sum;

// throw new UnsupportedOperationException();
    }

}