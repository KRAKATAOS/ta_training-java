package com.epam.training.student_Konstantin_Belin.classes.SumOfPrevious;
import java.util.Arrays;

/*
public class SumOfPrevious {
    public static boolean[] getSumCheckArray (int[] array){

        boolean[] array2 = new boolean[array.length];
        for (int i = 0; i < array.length; i++) {
            if (array[i] == array[0] || array[i] == array[1]) {
                array2[i] = false;
            } else {
                if (array[i - 1] + array[i - 2] == array[i]) {
                    array2[i] = true;
                } else {
                    array2[i] = false;
                }
            }
        }
        return array2;
 }
    public static void main(String[] args){

        int[] array = new int[]{1, -1, 0, 4, 6, 10, 15, 25};

        System.out.println(Arrays.toString(getSumCheckArray(array)));

    }
}
*/
public class SumOfPrevious {

    public static void main(String[] args) {
        int[] array = new int[]{0,-1,-1,-1};
        System.out.println(Arrays.toString(getSumCheckArray(array)));



    }

    public static boolean[] getSumCheckArray(int[] array){

        boolean[] array2 = new boolean[array.length];
        for (int i = 0; i < array.length; i++) {
            if (i == 0 || i == 1) {

                array2[i] = false;
                System.out.println("Первый if !");
            } else {
                if ((array[i - 1] + array[i - 2]) == array[i]) {
                    array2[i] = true;
                    System.out.println("Второй if !"+ (array[i - 1] + array[i - 2]));
                    System.out.println(array [i]);

                } else {
                    array2[i] = false;
                    System.out.println("Второй else !");
                }
            }
        }
        return array2;

        //throw new UnsupportedOperationException();
    }
}
