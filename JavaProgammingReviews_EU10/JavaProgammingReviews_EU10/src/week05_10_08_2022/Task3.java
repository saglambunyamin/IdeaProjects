package week05_10_08_2022;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Thr Word");
        String a = scan.next();
        int b = a.length();
        String result = a.substring(1, (b-1));
        System.out.println(result);

    }
}
