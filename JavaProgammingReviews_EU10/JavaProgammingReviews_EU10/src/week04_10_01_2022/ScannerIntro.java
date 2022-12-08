package week04_10_01_2022;
import java.util.Scanner;

public class ScannerIntro {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

       System.out.println("Please Enter One Integer Number");
        int intValue = scanner.nextInt();
        System.out.println("You Entered "+intValue);

        scanner.nextLine();
        System.err.println("Give Me The Sentence");
        String sentence = scanner.nextLine();
        System.out.println("sentence = " + sentence);




    }
}
