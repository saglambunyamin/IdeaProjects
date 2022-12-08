package week10_11_12_2022;

public class MethodOverloadingIntro {
    public static void main(String[] args) {

        int s = sum(50,75);
        System.out.println("s = " + s);

        double r = sum(3.14, 14.4);
        System.out.println("r = " + r);

    }

    public static int sum (int a, int b) {
        return a+b;
    }

    public static double sum (double a, double b) {
        return a+b;
    }

    // public static double sum (int a, double b) { return a+b; }
    // --> gives error because of different variable types
}
