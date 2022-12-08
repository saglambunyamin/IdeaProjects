package day18_NestedLoop;

import java.util.Scanner;

public class EvenOrOddNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Enter Your Number");
            int num = scan.nextInt();

            if (num % 2 == 0) {
                System.out.println(num + " is Even Number");
            } else {
                System.out.println(num + " is Odd Number");
            }

            System.out.println("Would you like to enter another number?");
            String a = scan.next().toLowerCase();

            while ( ! ( a.equals("yes") || a.equals("no") ) ) {
                System.err.println("Please Re-Enter. Would you like to enter another number?");
                a = scan.next().toLowerCase();
            }
           if(a.equals("no")) {
                break;
            }

        }
    }
}
