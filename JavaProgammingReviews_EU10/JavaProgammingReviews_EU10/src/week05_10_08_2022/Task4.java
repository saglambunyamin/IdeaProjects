package week05_10_08_2022;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Thr Word");
        String a = scan.next();

        if (a.startsWith("red")) {
            System.out.println("red");
        } else if (a.startsWith("blue")) {
            System.out.println("blue");
        } else {
            System.out.println(" ");
        }

    }
}
