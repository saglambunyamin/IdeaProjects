package day53_FunctionalInterface;

import java.util.Arrays;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;

public class BuildInFunctionalInterfaces2 {
    public static void main(String[] args) {

        //Create a function that can check if the Integer is contained in an array of integer, return boolean
        BiPredicate<Integer[], Integer> contains = (a, b) -> {
            boolean result = false;
            for (Integer each : a) {
                if(each == b){
                    result = true;
                    break;
                }
            }
            return result;
        };

        Integer[] arr = {1,2,3,4,5,6,7,8,9,10};
        boolean r1 = contains.test(arr, 11);

        System.out.println("r1 = " + r1);

        System.out.println("==================================================");

        // create a function that can check if two strings are anagram
        BiPredicate<String, String> isAnagram = (a , b) -> {
            String [] arr1 = a.split("");
            String [] arr2 = b.split("");
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            return Arrays.equals(arr1, arr2);
        };

        System.out.println("==================================================");

        // create a function that can print the given string for given number of times
        BiConsumer<String, Integer> printMultipleTimes = (s, n) -> {
            for (int i = 0; i < n; i++) {
                System.out.println(s);
            }
        };
        printMultipleTimes.accept("Java", 5);

        System.out.println("==================================================");



    }
}
