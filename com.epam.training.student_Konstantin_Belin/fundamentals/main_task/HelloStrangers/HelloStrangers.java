package com.epam.training.student_Konstantin_Belin.fundamentals.main_task.HelloStrangers;

import java.util.Scanner;

public class HelloStrangers {
    public static void main(String[] args) {
        Scanner sanner = new Scanner(System.in);
        int amount = Integer.valueOf(sanner.nextLine());
        if (amount < 0) {
            System.out.println("Seriously? Why so negative?");
        } else if (amount == 0) {
            System.out.println("Oh, it looks like there is no one here");
        } else {
            for (int i = 0; i < amount; i++) System.out.println("Hello, " + sanner.nextLine());
        }
    }
}

