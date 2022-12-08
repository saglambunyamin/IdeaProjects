package day19_LoopPractices;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter First Number");
        int num1 = scan.nextInt();

        System.out.println("Enter A Math Operator + or -");
        char o = scan.next().charAt(0);
        if( ! (o == '+' || o == '-') ) {
            System.err.println("Invalid Math Operator " + o);
            System.exit(0);
        }

        System.out.println("Enter Second Number");
        int num2 = scan.nextInt();

        int result = 0;
        if(o == '+') {
            result = num1 + num2;
        } else {
            result = num1 - num2;
        }
        System.out.println("Result = " + result);
    }
}
