package week09_11_05_2022;

import java.util.Scanner;

public class DifferenceWith21 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = s.nextInt();

        int answer = DifferenceFrom21(number);
        System.out.println("Answer is = " + answer);
    }
    public static int DifferenceFrom21 (int number) {
        int result = 0;
        if(number>21) {
            result = (number - 21) *2;
        } else {
            result = 21 - number;
        }
        return result;
    }
}
