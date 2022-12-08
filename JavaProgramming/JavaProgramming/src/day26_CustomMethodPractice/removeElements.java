package day26_CustomMethodPractice;

import Utilities.ArraysUtility;

import java.util.Arrays;

public class removeElements {
    public static void main(String[] args) {

        int [] array2 = {10, 20, 30, 40, 50};
        array2 = ArraysUtility.removeElement(array2, 2);
        System.out.println(Arrays.toString(array2));

        double [] array = {3.14, 5.6, 7.5, 9.6, 8.1};
        array = ArraysUtility.removeElement(array, 3);
        System.out.println(Arrays.toString(array));

        char [] chars = {'g', 'h', 'k', 'p', 'y', 't', 'r'};
        chars = ArraysUtility.removeElement(chars, 4);
        System.out.println(Arrays.toString(chars));

        String [] firms = {"Cydeo", "Java", "Apple", "Samsung", "Huawei"};
        firms = ArraysUtility.removeElement(firms, 3);
        System.out.println(Arrays.toString(firms));


    }

}
