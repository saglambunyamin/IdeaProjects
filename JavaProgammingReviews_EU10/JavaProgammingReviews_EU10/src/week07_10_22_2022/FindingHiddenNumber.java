package week07_10_22_2022;

import java.util.Random;
import java.util.Scanner;

public class FindingHiddenNumber {
    public static void main(String[] args) {

        Random random = new Random();
        int hiddenNumber = random.nextInt(10)+1;

        boolean flag = true;

        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Enter A Number");
            int searchedNumber = scan.nextInt();
            if(searchedNumber==hiddenNumber) {
                System.out.println("You Found The Number Congrats!");
                flag=false;
            } else {
                System.out.println("You Missed. Try Again");
            }
        } while (flag);




    }
}
