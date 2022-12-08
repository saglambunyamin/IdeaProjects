package day09_IsElseStatements.day15_ForLoops;

public class Alphabet {
    public static void main(String[] args) {

        // A~Z --> 65 - 90 character numbers from A to Z in Ascii table
        for (int i = 65; i <= 90; i++) {
            System.out.print((char) i + " ");
        }

        System.out.println("\n----------------------------------------------------------------");

        for (char i = 'A' ; i <= 'Z' ; i++) {
            System.out.print(i + " ");
        }

        System.out.println("\n----------------------------------------------------------------");

        for (char i = 'a' ; i <= 'z' ; i++) {
            System.out.print(i + " ");
        }

        System.out.println("\n----------------------------------------------------------------");

        for (char i = 'Z' ; i >= 'A' ; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n----------------------------------------------------------------");

        for (char i = 'z' ; i >= 'a' ; i--) {
            System.out.print(i + " ");
        }

    }

}
