package week05_10_08_2022;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        System.out.println("Enter A Word");
        String word = new Scanner(System.in).next();
        char encryptWith = 'X';
        String encryptPassword = "";

        for (int i = 0; i < word.length(); i++) {
            encryptPassword += "" + word.charAt(i) + encryptWith;
            }
        System.out.println(encryptPassword);

    }
}
