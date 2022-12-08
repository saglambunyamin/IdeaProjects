package day26_CustomMethodPractice;

import Utilities.ArraysUtility;

import java.util.Arrays;

public class MergeArrays {
    public static void main(String[] args) {

        int [] numbers1 = {11, 22, 33, 44, 55};
        int [] numbers2 = {66, 77, 88, 99};
        int [] numbers = ArraysUtility.merge(numbers1, numbers2);
        System.out.println(Arrays.toString(numbers));
        System.out.println("------------------------------------------------------------");

        double [] decimals1 = {3.14, 4.5, 5.6, 9.8};
        double [] decimals2 = {14.4, 19.6, 22.5};
        double [] decimals = ArraysUtility.merge(decimals1, decimals2);
        System.out.println(Arrays.toString(decimals));
        System.out.println("------------------------------------------------------------");

        char [] chars1 = {'A', 'B', 'D'};
        char [] chars2 = {'U', 'S', 'A'};
        char [] chars = ArraysUtility.merge(chars1, chars2);
        System.out.println(Arrays.toString(chars));
        System.out.println("------------------------------------------------------------");

        String [] cars1 = {"Audi", "Bmw", "Mercedes"};
        String [] cars2 = {"Honda", "Mazda", "Toyota"};
        String [] cars = ArraysUtility.merge(cars1, cars2);
        System.out.println(Arrays.toString(cars));

    }
}
