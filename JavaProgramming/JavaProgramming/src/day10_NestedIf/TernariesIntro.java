package day10_NestedIf;

public class TernariesIntro {

    public static void main(String[] args) {

        int n = 100;

        if (n%2 == 0) {
            System.out.println("EVEN NUMBER");
        } else {
            System.out.println("ODD NUMBER");
        }
        System.out.println("--------------------------------");

        String result = (n%2 == 0)? "EVEN NUMBER" : "ODD NUMBER";
        System.out.println(result);
        System.out.println("--------------------------------");

        int age = 23;
        String result2 = (age>= 21)? "Eligible" : "Not Eligible";
        System.out.println(result2);
        System.out.println("--------------------------------");

        int number = 100;
        String result3 = (number > 0) ? "POSITIVE" : (number < 0) ? "NEGATIVE" : "ZERO";
        System.out.println(result3);

    }
}
