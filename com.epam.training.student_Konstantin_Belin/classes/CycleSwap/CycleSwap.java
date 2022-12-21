package com.epam.training.student_Konstantin_Belin.classes.CycleSwap;

class CycleSwap {
    static void cycleSwap(int[] array) {
        if(array.length > 0){
            int lastElement = array[array.length-1];
            for (int i = array.length-1;i>0;i--){
                array[i] = array[i-1];
            }
            array[0] = lastElement;
        }
    }

    static void cycleSwap(int[] array, int shift) {
        if(array.length > 0){
            for(int i = 0; i < shift; i++){
                int lastElement = array[array.length-1];
                for(int j = array.length-1;j>0;j--){
                    array[j] = array[j-1];
                }
                array[0] = lastElement;
            }
        }
    }
}