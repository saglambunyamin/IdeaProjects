package day25_Method_Overloading;

import Utilities.ArraysUtility;

public class Test2 {
    public static void main(String[] args) {

        int [] numbers = {1,2,3,4,5,6,7,8,9,10};
        ArraysUtility.printEachElement(numbers);
        System.out.println("-----------------------------------");

        char [] chars = {'A', 'B', 'D'};
        ArraysUtility.printEachElement(chars);
        System.out.println("-----------------------------------");

        double [] decimals = {3.14, 9.6, 14.4, 25.6};
        ArraysUtility.printEachElement(decimals);
        System.out.println("-----------------------------------");

        String [] days = {"Monday", "Tuesday", "Wednesday", "Thursday"};
        ArraysUtility.printEachElement(days);
        System.out.println("-----------------------------------");

        int [] integers = {45, 37, 86, 23, 17, 98};
        boolean containing =  ArraysUtility.contains(integers, 23);
        System.out.println("Containing Given Number = " + containing);
        System.out.println("-------------------------------------");

        String [] months = {"May", "March", "June", "July"};
        boolean containing2 = ArraysUtility.contains(months, "September");
        System.out.println("Containing Given Month = " + containing2);
        System.out.println("----------------------------------------");

        char [] characters = {'a', 'b', 'r', 'o', 't', 'l', 'p'};
        boolean containing3 = ArraysUtility.contains(characters, 'w');
        System.out.println("Containing Given Character = " + containing3);

    }
}
