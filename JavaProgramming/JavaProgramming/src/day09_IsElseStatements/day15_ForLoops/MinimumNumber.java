package day09_IsElseStatements.day15_ForLoops;

import java.util.Scanner;

public class MinimumNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int min = 2147483647;

        for ( int i = 1; i <= 5; i++) {
            System.out.println("Enter A Number");
            int num = scan.nextInt();

            if(num < min) {
                min = num;
            }
        }

        System.out.println("min = " + min);

    }
}
