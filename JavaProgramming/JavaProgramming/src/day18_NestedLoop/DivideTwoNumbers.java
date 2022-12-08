package day18_NestedLoop;

import java.util.Scanner;

public class DivideTwoNumbers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter The First Number");
        int a = scan.nextInt();
        System.out.println("Enter The Second Number");
        int b = scan.nextInt();
        int count = 0;

        while (a >= b){
            a -= b;
            count++;
        }
        System.out.println("The Result Is = " + count);

    }
}
