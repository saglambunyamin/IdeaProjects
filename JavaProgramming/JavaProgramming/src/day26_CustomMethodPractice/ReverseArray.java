package day26_CustomMethodPractice;

import Utilities.ArraysUtility;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {

        int [] arr = {1,2,3,4};
        int [] reverse = ArraysUtility.reverse(arr);
        System.out.println(Arrays.toString(reverse));
        System.out.println("-------------------------------------------------------------");

        double [] arr2 = {3.14, 5.6, 9.6, 14.4};
        double [] decimals = ArraysUtility.reverse(arr2);
        System.out.println(Arrays.toString(decimals));
        System.out.println("-------------------------------------------------------------");

        char [] chars = {'N', 'A', 'M', 'U', 'N'};
        char [] chars1 = ArraysUtility.reverse(chars);
        System.out.println(Arrays.toString(chars1));
        System.out.println("-------------------------------------------------------------");

        String [] cars = {"Audi", "Toyota", "Bmw", "Honda", "Mazda"};
        String [] cars1 = ArraysUtility.reverse(cars);
        System.out.println(Arrays.toString(cars1));



    }
}
