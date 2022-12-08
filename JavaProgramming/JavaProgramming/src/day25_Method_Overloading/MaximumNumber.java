package day25_Method_Overloading;

import Utilities.ArraysUtility;

public class MaximumNumber {
    public static void main(String[] args) {
        int [] nums = {78, 57, 95, 47, 53};
        int maximum = ArraysUtility.maximumNumber(nums);
        System.out.println("Maximum Number is = " + maximum);

        double [] numbers = {3.14, 5.6, 22.5, 14.4};
        double maxDecimal = ArraysUtility.maximumNumber(numbers);
        System.out.println("Maximum Decimal Number is = " + maxDecimal);

    }
}
