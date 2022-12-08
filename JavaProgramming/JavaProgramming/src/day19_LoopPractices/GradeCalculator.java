package day19_LoopPractices;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {

        while (true) {
            System.out.println("Enter Your Score");
            Scanner s = new Scanner(System.in);
            int score = s.nextInt();

            if(score >= 90 && score < 100) {
                System.out.println("A");
            } else if(score >= 80 && score < 90) {
                System.out.println("B");
            } else if(score >= 70 && score < 80) {
                System.out.println("C");
            } else if(score >= 60 && score < 70) {
                System.out.println("D");
            } else if(score >= 0 && score < 60) {
                System.out.println("F");
            } else {
                System.err.println("Invalid Entry");
                break;
            }

            System.out.println("Would You Like To Continue?");
            String answer = s.next();
            if(!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))) {
                System.err.println("Invalid Entry, Please Retry");
                answer = s.next();
            }
            if (answer.equalsIgnoreCase("no")) {
                System.out.println("Thank you for using Cydeo Grade Calculator APP");
                System.exit(0);
            }

        }

    }
}
