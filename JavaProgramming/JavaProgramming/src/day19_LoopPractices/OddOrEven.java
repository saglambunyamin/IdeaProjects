package day19_LoopPractices;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {

        while(true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter A Number:");
            int a = scan.nextInt();

            if (a % 2 == 0) {
                System.out.println("Even Number");
            } else {
                System.out.println("Odd Number");
            }

            System.out.println("Would You Like To Enter Another Number? (yes/no)");
            String s = scan.next();

            if (!(s.equalsIgnoreCase("yes") || s.equalsIgnoreCase("no"))) {
                System.err.println("Invalid Entry");
                System.exit(0);
            }

            if (s.equalsIgnoreCase("no")) {
                System.out.println("Thank You For Using Calculator.");
                System.exit(0);
            }
        }
    }
}
