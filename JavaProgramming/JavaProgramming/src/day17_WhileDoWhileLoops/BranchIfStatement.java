package day17_WhileDoWhileLoops;

import java.util.Scanner;

public class BranchIfStatement {
    public static void main(String[] args) {

        for (char i = 'A'; i <= 'Z' ;i++) {
            System.out.print( i + " ");

            if (i == 'F') {
            break;
        }
        }
        System.out.println("---------------------------------------------------");

        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Enter A Number");
            int num = scan.nextInt();

            if (num < 0){
                break;
            }
        }

    }
}
