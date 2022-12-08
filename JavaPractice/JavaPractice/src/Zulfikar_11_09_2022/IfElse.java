package Zulfikar_11_09_2022;

public class IfElse {
    public static void main(String[] args) {

        boolean isEmpty = true;

        if (isEmpty) {
            System.out.println("Please go to gas station");
        } else {
            System.out.println("Please go on");
        }
        System.out.println("----------------------------------");

        int price = 1000;
        int cash = 900;
        if (cash >= price ) {
            System.out.println("I can afford it.");
        } else {
            System.out.println("I can't afford it.");
        }

    }
}
