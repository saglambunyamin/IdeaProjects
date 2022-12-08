package day27_WrapperClasses;

import Utilities.ArraysUtility;

import java.util.Arrays;

public class replaceAll {
    public static void main(String[] args) {

        int [] array = {1,2,1,3,4,1,5};
        array = ArraysUtility.replaceAll(array, 1, 10);
        System.out.println(Arrays.toString(array));
        System.out.println("--------------------------------------------------------");

        double [] decimals = {3.14, 14.4, 3.14, 19.6, 22.5, 3.14};
        decimals = ArraysUtility.replaceAll(decimals, 3.14, 22.5);
        System.out.println(Arrays.toString(decimals));
        System.out.println("---------------------------------------------------------");

        char [] chars = {'q', 'w', 'q', 'e', 'r', 'q',  't', 'h', 'q' };
        chars = ArraysUtility.replaceAll(chars, 'q', 'f');
        System.out.println(Arrays.toString(chars));
        System.out.println("---------------------------------------------------------");

        String [] holidays = {"Sunday", "Saturday", "Sunday", "Monday", "Sunday"};
        holidays = ArraysUtility.replaceAll(holidays, "Sunday", "Monday");
        System.out.println(Arrays.toString(holidays));

    }
}
