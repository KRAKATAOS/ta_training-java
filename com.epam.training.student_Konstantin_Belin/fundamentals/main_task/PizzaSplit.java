package com.epam.training.student_Konstantin_Belin.fundamentals.main_task;
import java.util.Scanner;

public class PizzaSplit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int people = scanner.nextInt();
        int pieces = scanner.nextInt();
        int pizza = 1;
        int countOfPiec = pieces;

        while(people > 0) {
            pieces = countOfPiec;
            pieces *= pizza;
            if(pieces % people == 0){
                break;
            }
            pizza++;
        }
        System.out.println(pizza);


    }

}
