package Zulfikar_12_21_2022;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner str = new Scanner(System.in);
        System.out.println("Enter Your Number");
        String input = str.nextLine();
        int number = Integer.parseInt(input);

        boolean isExpected = false;

        if (number >= 0) {
            isExpected = true;
        } else {
            isExpected = false;
        }
        System.out.println("isExpected = " + isExpected);

    }
}

/*
-Wrapper class
1. write a java program, let user enter a number as string,
if the number is below zero, return false,
    else return true
 */