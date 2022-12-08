package Utilities;

public class MathUtilityTest {
    public static void main(String[] args) {

        int sum = MathUtility.sumOfTwoNumbers(25, 45);
        System.out.println(" Result = " + sum);
        System.out.println("-----------------");

        double sum2 = MathUtility.sumOfTwoNumbers(15.5, 68.3);
        System.out.println("Result = " + sum2);
        System.out.println("-----------------------");

        int p = MathUtility.permutation(5);
        System.out.println("p = " + p);
        System.out.println("-----------------------");

        int t = MathUtility.perimeterOfTriangle(5,12,13);
        System.out.println("t = " + t);
        System.out.println("-----------------------");

    }
}
