package week08_10_29_2022;

import com.sun.security.jgss.GSSUtil;

import java.util.Arrays;

public class ForEachLoopIntro {
    public static void main(String[] args) {

        int [] numbers = {1,2,3,4,5};

        for (int each: numbers) {
            System.out.print(each);
        }
        System.out.println("\n==============================");

        String word = "Adam";
        char [] letters = word.toCharArray();

        for (char letter : letters) {
            System.out.print(letter + " ");
        }
        System.out.println("\n==============================");

        String sentence = "Java is a good language";
        String [] words = sentence.split(" ");
        System.out.println(Arrays.toString(words));
        System.out.println("==============================");

    }
}
