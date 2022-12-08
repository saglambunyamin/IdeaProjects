package day19_LoopPractices;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {

        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter The Radius Of The Circle");
            int r = scan.nextInt();

            if (r <= 0) {
                System.err.println("Invalid Entry for the radius of the circle");
                System.exit(0);
            }
            int diameter = 2 * r;
            double area = 3.14 * r * r;
            double perimeter = 2 * 3.14 * r;
            System.out.println("Diameter = " + diameter);
            System.out.println("Area = " + area);
            System.out.println("Perimeter = " + perimeter);

            System.out.println("Would you like to calculate another circle? (yes/no)");
            String answer = scan.next();

        if(answer.equalsIgnoreCase("no")) {
            System.err.println("Thank you for using Cydeo Circle Calculator APP");
            System.exit(0);
        }
        }

    }
}
