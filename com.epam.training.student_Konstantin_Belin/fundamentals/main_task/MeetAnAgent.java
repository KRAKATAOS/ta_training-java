package com.epam.training.student_Konstantin_Belin.fundamentals.main_task;
import java.util.Scanner;

public class MeetAnAgent {
    final static int PASSWORD = 133976; //You can change pass, but don't change the type

    public static void main(String[] args) {
        int code = new Scanner(System.in).nextInt();

        if (code==PASSWORD){
            System.out.println("Hello, Agent");
        }
        else{
            System.out.println("Access denied");
        }
    }
}


