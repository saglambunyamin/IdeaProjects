package week05_10_08_2022;
import java.lang.String;
import java.util.Scanner;

public class LoopIntro {
    public static void main(String[] args) {

        for (int i=1; i<101; i++) {
            System.out.print(i + " ");
        }

        System.out.println("\n");
        for (int i = 0; i < 101; i+=5) {
            System.out.print(i + " ");
        }

        System.out.println("\n");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter A Number");
         int a = scan.nextInt();

        for (int i = 1; i <= a; i++) {
            System.out.print(i + " ");
        }
    }
}
