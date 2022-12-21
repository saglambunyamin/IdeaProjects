package Zulfikar_12_21_2022;

import java.util.ArrayList;
import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        numbers.remove(2);
        numbers.remove(3);
        numbers.remove(4);

        System.out.println("numbers = " + numbers);

    }
}

/*
    Write a Java program that creates an ArrayList of 10 integers, and
then removes the elements at index positions 2, 4, and 6 from the list.
The program should then print the resulting list to the console.
 */