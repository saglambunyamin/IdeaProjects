package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysPractices3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("How Many Numbers Would You Like To Enter?");
        int length = scan.nextInt();

        if(length <= 0) {
            System.out.println("Invalid Entry");
            System.exit(0);
        }

        int [] numbers = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.println("Enter The Number " + (i+1));
            numbers[i] = scan.nextInt();
        }
        System.out.println("You Entered These Numbers: " + Arrays.toString(numbers));
        scan.close();

    }
}
