package day25_Method_Overloading;

public class SumOfNumbers {
    public static void main(String[] args) {

       int sum = sumOfTwoNumbers(4,5);
        System.out.println("Result = " + sum);

        int sum2 = sumOfThreeNumbers(60,55,36);
        System.out.println("Result = " + sum2);

        int sum3 = sumOfFourNumbers(25,65,75,95);
        System.out.println("Result = " + sum3);

    }

    public static int sumOfTwoNumbers (int a, int b) {
        return a+b;
    }
    public static int sumOfThreeNumbers (int a, int b, int c) {
        return a+b+c;
    }
    public static int sumOfFourNumbers (int a, int b, int c, int d) {
        return a+b+c+d;
    }
}
