package day17_WhileDoWhileLoops;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Your First Number");
        int n1 = scan.nextInt();
        System.out.println("Enter Your Second Number");
        int n2 = scan.nextInt();
        System.out.println("Enter A Math Operator");
        char ch = scan.next().charAt(0);

        if (!(ch == '+' || ch == '-' || ch == '*' || ch == '/' )) {
            System.out.println("Invalid Operator, Please Re-Enter");
            ch = scan.next().charAt(0);
        }
        System.out.print("Result Is:");
        System.out.print( (ch == '+')? n1+n2: (ch == '-')? n1-n2: (ch == '*')? n1*n2: n1/n2  );
    }
}
