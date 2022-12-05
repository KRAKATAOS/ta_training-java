package com.epam.training.student_Konstantin_Belin.fundamentals.main_task;

import java.util.Scanner;

public class GoDutch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bill = sc.nextInt();
        int people = sc.nextInt();

        if (bill < 0) {
            System.out.println("Bill total amount cannot be negative");
        } else if (people <= 0) {
            System.out.println("Number of friends cannot be negative or zero");
        }else {
            int amountPerPerson = 0;
            int tip = 10;
            while (tip==10) {
                tip = bill * 10 / 100;
                amountPerPerson = bill / people + tip / people;
                if (bill!=0 && amountPerPerson==0){
                    amountPerPerson++;
                }
                System.out.println(amountPerPerson);
            }
         }
    }
}