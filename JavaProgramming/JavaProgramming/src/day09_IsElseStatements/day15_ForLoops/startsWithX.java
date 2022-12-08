package day09_IsElseStatements.day15_ForLoops;
import java.lang.String;
import java.util.Scanner;

public class startsWithX {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Word");
        String word = input.next();
        String result = "";

        if(word.charAt(0) == 'x') {
            result = word.replaceFirst("x", "a");
            System.out.println(result);
        }else{
            System.out.println(word);
        }
    }

}
