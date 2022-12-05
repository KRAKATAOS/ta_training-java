package com.epam.training.student_Konstantin_Belin.fundamentals.main_task;
import java.util.Scanner;
import java.util.Locale;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double D = Math.pow(b, 2)- 4 * a * c;


        if (a == 0) {
            if (b == 0 && (c == 0 || c != 0)) {
                System.out.println("no root");
            }

        }else {
            if (D > 0){

               double x1 = ((-b) - (Math.sqrt(D))) / (2 * a);
               double x2 = ((-b) + (Math.sqrt(D))) / (2 * a);
            System.out.println(x1 + " "+ x2);
            }
            else if (D==0) {
                double x = 0;
                x = (-b)/ (2*a);
                System.out.println(x);
            } else if (D<0) {
                System.out.println("no root");

            }

        }

    }
}