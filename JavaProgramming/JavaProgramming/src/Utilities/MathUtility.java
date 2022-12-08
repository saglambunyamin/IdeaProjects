package Utilities;

public class MathUtility {
    public static int sumOfTwoNumbers (int a, int b) {
        return a+b;
    }

    public static double sumOfTwoNumbers (double a, double b) {
        return a+b;
    }

    public static int permutation (int number) {

        for (int i = number-1;i >= 1; i--) {
            number = number * i;
        }
        return number;
    }

    public static int perimeterOfTriangle (int a, int b, int c) {
        return a+b+c;
    }

    public static double perimeterOfTriangle (double a, double b, double c) {
        return a+b+c;
    }

}
