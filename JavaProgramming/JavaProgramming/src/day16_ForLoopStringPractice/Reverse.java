package day16_ForLoopStringPractice;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {

        Scanner word = new Scanner(System.in);
        System.out.println("Enter Your Word");
        String str = word.nextLine();
        int a = str.length() - 1;
        String result = "";

        for (int i = a; i >= 0; i--) {
            result += str.charAt(i);
        }
        System.out.print(result);
    }
}
/*
1. Write a program that can reverse a String
			Ex:
				input:
					Wooden Spoon
				output:
					noopS nedooW
 */