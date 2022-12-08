package week09_11_05_2022;

public class MethodsIntro {
    public static void main(String[] args) {
        printHello5Times();

        MultiplyWith2AndPrint(6,5);
    }

    public static void printHello5Times() {
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
    }

    public static int MultiplyWith2AndPrint (int a, int b) {
        int sum = a+b;
        int multiply = sum * 2;
        System.out.println("Result= " + multiply);
        return multiply;
    }
}
