package day07_Operators;

public class UnaryOperators {

    public static void main(String[] args) {

        int num1 = +25;
        int num2 = -25;

        System.out.println("=======================");

        int b = 100;
        System.out.println(++b); //pre increment: increase the value +1 immediately

        int c = 100;

        System.out.println(c++); // post increment: increase the value +1 after this line
        System.out.println(c);

        System.out.println("====================================================");

        int x = 200;
        System.out.println(--x); //pre decrement: dicreases the vale -1 immediately

        int y = 200;
        System.out.println(y--); //post decrement: dicreases the value -1 after this line
        System.out.println(y);




    }
}
