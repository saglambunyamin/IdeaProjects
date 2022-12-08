package week05_10_08_2022;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter The Word");
        String s = scan.next();
        String s2 = s.charAt(0) + ""+ s.charAt(1);
        System.out.println(s2.toUpperCase());



    }

}
/*
Task 1: Given a string, print the string made of its first two chars,
           so the String "Hello" or "hello" yields “HE".

 */