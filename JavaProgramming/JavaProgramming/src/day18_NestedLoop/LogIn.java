package day18_NestedLoop;

import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Your Username");
        String userName = scan.next();
        System.out.println("Enter Your Password");
        String password = scan.next();
        if(userName.equals("Cydeo") && password.equals("WoodenSpoon")) {
            System.out.println("Logged In");
        } else {
            for (int i = 1; i <= 3; i++) {
                System.out.println("Incorrect User Name Or Password");
                System.out.println("Enter Your Username");
                userName = scan.next();
                System.out.println("Enter Your Password");
                password = scan.next();

                if(userName.equals("Cydeo") && password.equals("WoodenSpoon")) {
                    System.out.println("Logged In");
                    break;
                }
            }
            if(! (userName.equals("Cydeo") && password.equals("WoodenSpoon")) ) {
                System.err.println("Your Account Is Locked");
            }
        }

    }
}
