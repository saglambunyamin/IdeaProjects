package day17_WhileDoWhileLoops;

import java.util.Scanner;

public class MarriageProposal {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Will You Marry Me?");
        String answer = s.next().toLowerCase();

        while ( ! (answer.equals("yes") || answer.equals("no"))) {
            System.out.println("Invalid Answer. Please Retry");
            answer = s.next().toLowerCase();
        }

        if (answer.equals("yes")) {
            System.out.println("Congrats");
        } else {
            System.out.println("Goodbye");
        }

    }
}
