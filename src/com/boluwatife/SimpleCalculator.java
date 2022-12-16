package com.boluwatife;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);

        //first user input
        System.out.println("Enter your first number:");

        double x;     //used double instead of int to handle fractions & accuracy
        x = input.nextInt();
        //second user input
        System.out.println("Enter your second number:");

        double y;
        y = input.nextInt();
        //arithmetic operation to be performed
        System.out.println("Choose an operator: 1 for addition, 2 for subtraction, 3 for multiplication, 4 for division");
        int cal = input.nextInt();

        /*
        //using switch case
        switch (cal) {
            case 1:
                System.out.println("The sum is: " + (x + y));
                break;
            case 2:
                System.out.println("The difference is: " + (x - y));
                break;
            case 3:
                System.out.println("The product is: " + (x * y));
                break;
            case 4:
                System.out.println("The division: " + (x / y));
                break;
            default:
                System.out.println("Invalid operator");
            }
         */
        //using if/else statements
        if (cal==1)
            System.out.println("The sum is: "+(x+y));
        else if (cal==2)
            System.out.println("The difference is:"+(x-y));
        else if (cal==3)
            System.out.println("The product is:"+(x*y));
        else if (cal==4)
            System.out.println("The division is:"+(x/y));
        else
            System.out.println("Invalid operator, please select between operators 1 and 4");
    }

}
