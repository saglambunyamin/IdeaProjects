package day22_MultiDimensionalArray;

import java.util.Arrays;

public class ReverseSentence {
    public static void main(String[] args) {

        String sentence = "Today is a good day to learn Java";
        String [] array = sentence.split(" ");

        String reservedArray = "";

        for (int i = array.length-1; i >= 0 ; i--) {
            reservedArray += array[i] + " ";
        }
        System.out.println(reservedArray);

    }
}
