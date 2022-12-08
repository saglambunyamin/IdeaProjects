package day22_MultiDimensionalArray;

import java.util.Arrays;

public class ReserveSecondWord {
    public static void main(String[] args) {

        String sentence = "I love Java";
        String [] words = sentence.split(" ");
        String reverse = "";
        for (int i = words[1].length()-1; i >=0 ; i--) {
            reverse += words[1].charAt(i);
        }
       sentence = sentence.replaceFirst(words[1], reverse );
        System.out.println(sentence);
    }
}
