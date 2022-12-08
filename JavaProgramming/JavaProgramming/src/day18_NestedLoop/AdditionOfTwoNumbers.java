package day18_NestedLoop;

import java.util.Scanner;

public class AdditionOfTwoNumbers {
    public static void main(String[] args) {

        while (true) {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter Your First Number");
            int a = s.nextInt();
            System.out.println("Enter Your Second Number");
            int b = s.nextInt();
            System.out.println("Addition: " + (a + b));
            System.out.println("Would You Like To Continue?");
            String str = s.next().toLowerCase();

            while ( ! (str.equals("yes") || str.equals("no")) ) {
                System.err.println("Invalid Entry, Please Retry");
                str = s.next().toLowerCase();
            }

            if(str.equals("no")) {
                break;
            }
        }
    }
}
