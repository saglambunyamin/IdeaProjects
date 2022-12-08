package day17_WhileDoWhileLoops;

import java.sql.SQLOutput;
import java.util.Scanner;

public class EligibleToVote {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Your Age");
        int age = scan.nextInt();

        while ( !( age > 0 && age <=120)) {
            System.err.println("Invalid Age, Please Re-Enter");
            System.out.println("Enter Your Age");
            age = scan.nextInt();
        }

        System.out.println("Are You A US Citizen? yes/no");
        String answer = scan.next().toLowerCase();

        while ( !(answer.equals("yes") || answer.equals("no"))) {
            System.err.println("Invalid Answer, Please Re-Enter");
            System.out.println("Are You A US Citizen? yes/no");
            answer = scan.next().toLowerCase();
        }

        if ( age >= 18 && answer.equals("yes")) {
            System.out.println("You Are Eligible To Vote");
        } else {
            System.out.println("You Are Not Eligible To Vote!");
        }

    }
}
