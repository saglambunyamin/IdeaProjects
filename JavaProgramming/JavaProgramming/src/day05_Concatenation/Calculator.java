package day05_Concatenation;

public class Calculator {

    public static void main(String[] args) {

        int FirstNumber = 100;
        int SecondNumber = 50;

        int Addition = FirstNumber + SecondNumber;
        int Subtraction = FirstNumber - SecondNumber;
        int Multiplication = FirstNumber * SecondNumber;
        int Division = FirstNumber / SecondNumber;


        System.out.println(FirstNumber + "+" + SecondNumber + "=" + Addition);
        System.out.println(FirstNumber + "-" + SecondNumber + "=" + Subtraction);
        System.out.println(FirstNumber + "*" + SecondNumber + "=" + Multiplication);
        System.out.println(FirstNumber + "/" + SecondNumber + "=" + Division);


    }
}
