package week02_09_17_2022;

public class BasicCalculator {

    public static void main(String[] args) {

        double firstNumber = 50;
        double secondNumber = 6;
        double sum = firstNumber+secondNumber;
        double subtract = firstNumber - secondNumber;
        double multiply = firstNumber*secondNumber;
        double divide = firstNumber/secondNumber;
        double remainder = firstNumber%secondNumber; //iki sayının bölümünden kalan

        System.out.println("sum = " + sum);
        System.out.println("subtract = " + subtract);
        System.out.println("multiply = " + multiply);
        System.out.println("divide = " + divide);
        System.out.println("remainder = " + remainder);


    }
}
