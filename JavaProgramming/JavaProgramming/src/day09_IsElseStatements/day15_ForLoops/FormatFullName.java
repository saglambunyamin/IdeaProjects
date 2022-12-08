package day09_IsElseStatements.day15_ForLoops;
import java.lang.String;
import java.util.Locale;
import java.util.Scanner;

public class FormatFullName {
    public static void main(String[] args) {

        System.out.println("Enter the First Name");
        String firstName = new Scanner(System.in).next();
        System.out.println("Enter the Last Name");
        String lastName = new Scanner(System.in).next();

        String first = firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase();
        String last = lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();
        System.out.println("Name is: " + first + " " + last);


    }
}
