package com.epam.training.student_Konstantin_Belin.fundamentals.main_task;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        int sum = 0;
        int count = 0;
        while(value != 0){
            sum += value;
            count++;
            value = scanner.nextInt();
        }
        System.out.println(sum/count);
    }

}
