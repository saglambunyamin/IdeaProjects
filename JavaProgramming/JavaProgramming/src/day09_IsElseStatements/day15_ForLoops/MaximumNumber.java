package day09_IsElseStatements.day15_ForLoops;

import java.util.Scanner;

public class MaximumNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int max = -2147483648;

        for ( int i = 1; i <= 5; i++) {
            System.out.println("Enter A Number");
            int num = scan.nextInt();

            if(num > max) {
                max = num;
            }
        }
        System.out.println("max = " + max);

    }
}
