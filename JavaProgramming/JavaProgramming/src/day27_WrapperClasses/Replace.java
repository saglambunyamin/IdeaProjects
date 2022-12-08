package day27_WrapperClasses;

import Utilities.ArraysUtility;

import java.util.Arrays;

public class Replace {
    public static void main(String[] args) {

        int [] array = {1,2,3,4,5};
        array = ArraysUtility.replace(array, 2, 30);
        System.out.println(Arrays.toString(array));
        System.out.println("---------------------------------------------------");

        double [] decimals = {3.14, 14.4, 19.6, 22.5};
        decimals = ArraysUtility.replace(decimals, 1, 6.25);
        System.out.println(Arrays.toString(decimals));
        System.out.println("----------------------------------------------------");

        char [] chars = {'q', 'w', 'e', 'r', 't', 'h'};
        chars = ArraysUtility.replace(chars, 5, 'y');
        System.out.println(Arrays.toString(chars));
        System.out.println("---------------------------------------------------");

        String [] holidays = {"Saturday", "Sunday", "Monday"};
        holidays = ArraysUtility.replace(holidays, 2, "Friday");
        System.out.println(Arrays.toString(holidays));

    }
}
