package day21_ForEachLoop;

import java.util.Arrays;

public class ArraysUtility {
    public static void main(String[] args) {

        int [] nums = {1, 2, 3, 4, 5};
        System.out.println(nums); // it doesn't work
        System.out.println(Arrays.toString(nums)); // it works

        System.out.println("=======================================");

        int [] scores = {95, 100, 55, 65, 75, 88};
        Arrays.sort(scores);
        System.out.println(Arrays.toString(scores));
        System.out.println("Max Number = " + scores[scores.length-1]);
        System.out.println("Min Number = " + scores[0]);

        System.out.println("=======================================");

        String [] names = {"Gunay", "Anna", "Zuhal", "Ahmet", "Maria", "Sinema"};
        Arrays.sort(names); // It sorts the names by their first characters from A to Z
        System.out.println(Arrays.toString(names));

        System.out.println("=======================================");

        int [] arr1 = {1,2,3};
        int [] arr2 = {1,3,2};
        boolean r1 = Arrays.equals(arr1,arr2);
        System.out.println(r1);

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        boolean r2 = Arrays.equals(arr1,arr2);
        System.out.println(r2);

        System.out.println("=======================================");

        char [] ch1 = {'a', 'c', 'b'};
        char [] ch2 = {'b', 'a', 'c'};
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        boolean anagram = Arrays.equals(ch1, ch2);
        System.out.println("Anagram = " + anagram);

    }

}

