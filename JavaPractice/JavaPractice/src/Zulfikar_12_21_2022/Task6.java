package Zulfikar_12_21_2022;

import java.util.ArrayList;
import java.util.Collections;

public class Task6 {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(12);
        numbers.add(23);
        numbers.add(41);
        numbers.add(58);
        numbers.add(37);
        numbers.add(18);
        numbers.add(29);
        numbers.add(45);
        numbers.add(53);

        int maxNumber = Collections.max(numbers);
        int minNumber = Collections.min(numbers);

        System.out.println("maxNumber = " + maxNumber);
        System.out.println("minNumber = " + minNumber);

    }
}
/*
Write a Java program that creates an ArrayList of integers and adds 10 random integers to the list.
The program should then find the smallest and largest elements in the list and print them to the console.
 */