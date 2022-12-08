package day27_WrapperClasses;

import Utilities.ArraysUtility;

import java.util.Arrays;

public class removeDuplicates {
    public static void main(String[] args) {

        int [] array = {1,2,1,3,4,3,5};
        array = ArraysUtility.removeDuplicates(array);
        System.out.println(Arrays.toString(array));
        System.out.println("----------------------------------------------------------");

        double [] decimals = {3.14, 14.4, 3.14, 19.6, 22.5, 14.4};
        decimals = ArraysUtility.removeDuplicates(decimals);
        System.out.println(Arrays.toString(decimals));
        System.out.println("---------------------------------------------------------");

        char [] chars = {'q', 'w', 'q', 'e', 'r', 'h',  't', 'h', 'r' };
        chars = ArraysUtility.removeDuplicates(chars);
        System.out.println(Arrays.toString(chars));
        System.out.println("--------------------------------------------------------");

        String [] holidays = {"Sunday", "Saturday", "Sunday", "Monday", "Saturday"};
        holidays = ArraysUtility.removeDuplicates(holidays);
        System.out.println(Arrays.toString(holidays));

    }
}
