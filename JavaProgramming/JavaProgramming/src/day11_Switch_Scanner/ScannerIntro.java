package day11_Switch_Scanner;
import java.util.Scanner;

public class ScannerIntro {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer:");

        int num1 = input.nextInt();
        int r = num1 * num1;
        System.out.println("The Result is= "+r);


    }

}
