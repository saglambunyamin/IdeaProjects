package Zulfikar_12_21_2022;

import java.util.ArrayList;
import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("Java", "Python", "C#", "Ruby", "C++"));

        list.remove(0);
        list.remove(list.size()-1);

        System.out.println("List = " + list);


    }
}

/*
    Write a Java program that creates an ArrayList of strings
and then adds five strings to the list.
    Then remove the first and last elements of the list, and then
print the remaining elements to the console.
 */