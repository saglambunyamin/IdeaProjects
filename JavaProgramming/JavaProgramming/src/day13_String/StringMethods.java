package day13_String;
import java.lang.String;

public class StringMethods {

    public static void main(String[] args) {

        String word = "INFORMATION";
        char thirdChar = word.charAt(2); // 3rd Character
        // Character numbers start from number zero!

        System.out.println(thirdChar);
        System.out.println("------------------------------");

        char tenthChar = word.charAt(9); // 10th Character
        System.out.println(tenthChar);
        System.out.println("------------------------------");

        String s1 = "Batch 25 is the best batch. Java Programming Language";
        int numberOfCharacter = s1.length();
        System.out.println(numberOfCharacter);
        char lastChar = s1.charAt(numberOfCharacter - 1);
        System.out.println(lastChar);
        System.out.println("------------------------------");

        String str = "wooden spoon";
        str = str.toUpperCase();
        System.out.println(str);
        System.out.println("------------------------------");

        String s = "JAVA";
        s = s.toLowerCase();
        System.out.println(s);
        System.out.println("------------------------------");


    }

}
