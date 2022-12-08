package day07_Operators;

public class ShorthandOperators {

    public static void main(String[] args) {

        double num1 = 2.5;
        num1 += 5.5; // num1 = 2.5 + 5.5 = 8

        System.out.println("num1 = " + num1);

        double availableBalance = 1000.50;
        //deposit = 300$
        availableBalance += 300;

        System.out.println("availableBalance = " + availableBalance);
        System.out.println("=========================================");
        //tax = 500$
        availableBalance -= 500;

        System.out.println("availableBalance = " + availableBalance);






    }
}
