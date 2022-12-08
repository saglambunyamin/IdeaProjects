package day25_Method_Overloading;

import Utilities.ArraysUtility;

import java.util.Arrays;

public class AddElementsToArray2 {
    public static void main(String[] args) {

        int [] numbers = {1,2,3,4,5,6};
        numbers = ArraysUtility.addElement(numbers, 7);
        System.out.println(Arrays.toString(numbers));
        System.out.println("----------------------------------");

        char [] chars = {'A', 'B', 'C', 'D'};
        chars = ArraysUtility.addElement(chars,'E');
        System.out.println(Arrays.toString(chars));
        System.out.println("----------------------------------");

        String [] names = {"Ahmet", "Oleksandr", "Sinem", "Cihad"};
        names = ArraysUtility.addElement(names, "Layan");
        System.out.println(Arrays.toString(names));

    }

   }
