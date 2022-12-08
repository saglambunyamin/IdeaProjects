package day26_CustomMethodPractice;

import Utilities.ArraysUtility;

import java.util.Arrays;

public class UniqueElements {
    public static void main(String[] args) {

    int [] array = {1,1,2,3,3,4,5,5,6,7,7,7,7};
    int [] uniqueInteger = ArraysUtility.uniqueElements(array);
        System.out.println("Unique Integers of Array: " + Arrays.toString(uniqueInteger));

    double [] array2 = {1.5, 2.5, 1.5, 3.5, 4.5, 4.5, 5.5, 5.5};
    double [] uniqueDecimal = ArraysUtility.uniqueElements(array2);
        System.out.println("Unique Decimals of Array: " + Arrays.toString(uniqueDecimal));

        char [] array3 = {'f', 'g', 't', 'y', 'y', 'g'};
        char [] uniqueChar = ArraysUtility.uniqueElements(array3);
        System.out.println("Unique Characters of Array: " + Arrays.toString(uniqueChar));

        String [] array4 = {"tall", "tall", "short", "wide", "long", "wide"};
        String [] uniqueWord = ArraysUtility.uniqueElements(array4);
        System.out.println("Unique Word: " + Arrays.toString(uniqueWord));


    }

}
