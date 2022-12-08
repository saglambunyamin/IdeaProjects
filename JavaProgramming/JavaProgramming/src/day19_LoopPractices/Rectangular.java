package day19_LoopPractices;

import java.util.Scanner;

public class Rectangular {
    public static void main(String[] args) {

        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the length of the Rectangle:");
            int x = scan.nextInt();
            if(x <= 0) {
                System.err.println("Invalid Entry for the length of the rectangle");
                System.exit(0);
            }
            System.out.println("Enter the width of the Rectangle:");
            int y = scan.nextInt();
            if(y <= 0) {
                System.err.println("Invalid Entry for the width of the rectangle");
                System.exit(0);
            }
            int Area = x*y;
            int Perimeter = 2*(x+y);
            System.out.println("Area Of Rectangle = " + Area);
            System.out.println("Perimeter Of Rectangle = " + Perimeter);

            System.out.println("Would you like to calculate another Rectangle?");
            String answer = scan.next();

            if(!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no") ) ) {
                System.err.println("Invalid Entry. Please Retry");
                answer = scan.next();
            }
            if(answer.equalsIgnoreCase("no")) {
                System.out.println("Thank you for using Cydeo Rectangle Calculator APP");
                System.exit(0);
            }

        }

    }
}
