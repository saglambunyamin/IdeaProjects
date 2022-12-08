package day19_LoopPractices;

import java.util.Scanner;

public class Square {
    public static void main(String[] args) {

        while(true) {
            System.out.println("Enter the side of the square:");
            Scanner s = new Scanner(System.in);
            int a = s.nextInt();

            if(a <= 0) {
                System.err.println("Invalid Entry for the side of the square");
                System.exit(0);
            }
            int area = a*a;
            int perimeter = 4*a;
            System.out.println("Area Of Square= " + area);
            System.out.println("Perimeter Of Square= " + perimeter);

            System.out.println("Would you like to calculate another Square? (yes/no)");
            String answer = s.next();

            if(answer.equalsIgnoreCase("no")) {
                System.out.println("Thank you for using Cydeo Square Calculator APP");
                System.exit(0);
            }


        }
    }
}
