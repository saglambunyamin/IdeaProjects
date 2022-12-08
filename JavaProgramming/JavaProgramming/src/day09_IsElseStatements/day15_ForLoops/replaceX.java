package day09_IsElseStatements.day15_ForLoops;
import java.lang.String;
import java.util.Scanner;

public class replaceX {
    public static void main(String[] args) {

        System.out.println("Enter A Word");
        String word = new Scanner(System.in).next();
        String result = word.replace("x", "a").replace("X", "a");
        System.out.println(result);


    }
}
