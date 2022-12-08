package day28_ArrayList;

import Utilities.StringUtility;

public class StrongPassword {
    public static void main(String[] args) {

        String password = "Cydeo1990w";

        boolean isStrongPasword = StringUtility.isStrongPassword(password);
        System.out.println("isStrongPasword = " + isStrongPasword);
    }
}

/*
1.Write a program that can verify if a password is a strong password.
Characteristics of strong passwords are:
        1.1 Password must be at least have 8 characters long, and should not contain space
        1.2 PassWord should at least contain one upper case letter
        1.3 PassWord should at least contain one lower case letter
        1.4 Password should at least contain one special characters
        1.5 Password should at least contain a digit

 */
