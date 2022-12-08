package day11_Switch_Scanner;

public class Calculator {
    public static void main(String[] args) {

        double a = 150;
        double b = 20;
        char operator = '+';

        if (operator == '+' || operator == '-' || operator == '*' || operator == '/') {

            switch (operator) {
                case '+':
                    System.out.println(a+b);
                    break;
                case '-':
                    System.out.println(a-b);
                    break;
                case '*':
                    System.out.println(a*b);
                    break;
                default:
                    System.out.println(a/b);

            }

        } else {
            System.out.println("invalid command");
        }
    }
}
