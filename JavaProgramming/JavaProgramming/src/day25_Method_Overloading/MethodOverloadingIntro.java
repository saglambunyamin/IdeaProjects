package day25_Method_Overloading;

import java.util.Arrays;

public class MethodOverloadingIntro {
    public static void main(String[] args) {
        int [] intArray = {5,6,0,-1,3,4};
        Arrays.sort(intArray);

        double [] doubleArray = {10.5, 11.5, 5.5, 4.5};
        Arrays.sort(doubleArray);

        char [] charArray = {'E', 'F', 'B', 'D', 'C', 'A'};
        Arrays.sort(charArray);
        System.out.println("--------------------------------------------------");

        int sum1=  sumOfNumbers(10,20,30);
        System.out.println("Result = " + sum1);

        double sum2 =  sumOfNumbers(10.5, 24.7);
        System.out.println("Result = " + sum2);


    }


    public static int sumOfNumbers (int a, int b) {
        return a+b;
    }

    public static double sumOfNumbers (double a, double b) {
        return a+b;
    }

    public static int sumOfNumbers (int a, int b, int c) {
        return a+b+c;
    }

    public static double sumOfNumbers (double a, double b, double c) {
        return a+b+c;
    }

    public static int sumOfNumbers (int a, int b, int c, int d) {
        return a+b+c+d;
    }

    public static double sumOfNumbers (double a, double b, double c, double d) {
        return a+b+c+d;
    }

}
