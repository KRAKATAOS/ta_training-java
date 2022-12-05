package com.epam.training.student_Konstantin_Belin.fundamentals.main_task.MeetAStranger;

import java.util.Scanner;

public class MeetAStranger {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.printf("type some text ");
        String txt = in.nextLine();
        System.out.printf("Hello, %s ", txt);
        in.close();
    }
}
