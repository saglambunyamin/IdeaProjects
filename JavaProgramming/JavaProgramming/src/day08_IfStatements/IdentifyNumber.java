package day08_IfStatements;

public class IdentifyNumber {

    public static void main(String[] args) {

        int number = 200;

        boolean isPositive = number > 0;
        boolean isNegative = number < 0;
        boolean isZero = number == 0;

        System.out.println("isPositive = " + isPositive);
        System.out.println("isNegative = " + isNegative);
        System.out.println("isZero = " + isZero);


    }
}
