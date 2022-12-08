package day18_NestedLoop;

import java.util.Scanner;

public class NestedLoopPractice {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

       while (true) {
           System.out.println("Enter Your Age");
           int age = scan.nextInt();

           while (!(age >= 1 && age <= 120)) {
               System.err.println("Invalid Entry, Please Re-Enter Your Age");
               age = scan.nextInt();
           }
           System.out.println("Would you like to continue?");
           String a = scan.next().toLowerCase();

           while( ! ( a.equals("yes") || a.equals("no") ) )  {
               System.out.println("Invalid Answer, Please Re-Enter. Would You Like To Continue?");
                a = scan.next().toLowerCase();

           }
           if(a.equals("no")) {
               break;
           }
       }
    }
}
