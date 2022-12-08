package day17_WhileDoWhileLoops;

import java.sql.SQLOutput;
import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter You Username");
        String u = scan.next();
        System.out.println("Enter Your Password");
        String p = scan.next();

        if (u.equals("Cydeo") && p.equals("Cydeo123")) {
            System.out.println("YOU LOGGED IN");
        } else {
            int attempt = 2;
            while ( !(u.equals("Cydeo") && p.equals("Cydeo123") )  &&  attempt > 0) {
                if (attempt == 1) {
                    System.out.println("THIS IS YOUR LAST CHANCE");
                }
                if (attempt == 2) {
                    System.out.println("PLEASE ATTENTION");
                }
                System.out.println("USERNAME OR PASSWORD IS NOT CORRECT. PLEASE RETRY");

                System.out.println("Enter Your Username");
                u = scan.next();
                System.out.println("Enter Your Password");
                p = scan.next();
                attempt--;
            }
        }
        if (u.equals("Cydeo") && p.equals("Cydeo123")){
            System.out.println("YOU LOGGED IN");
        } else {
            System.out.println("YOUR ACCOUNT IS LOCKED!");
        }

    }
}