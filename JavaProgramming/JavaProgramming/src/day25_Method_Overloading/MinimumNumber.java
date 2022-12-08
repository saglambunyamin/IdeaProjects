package day25_Method_Overloading;

import Utilities.ArraysUtility;

public class MinimumNumber {
    public static void main(String[] args) {

        int [] integers = {36, 87, 37, 29, 52};
        int minimumInteger = ArraysUtility.minimumNumber(integers);
        System.out.println("Minimum Integer Number = " + minimumInteger);
        System.out.println("--------------------------------------------");

        double [] decimals = {56.9, 47.3, 83.6, 31.4};
        double minimumDecimal = ArraysUtility.minimumNumber(decimals);
        System.out.println("Minimum Decimal Number = " + minimumDecimal);

    }
}
