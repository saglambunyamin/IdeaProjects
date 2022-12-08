package week09_11_05_2022;

public class EvenOrOdd {

    public static void main(String[] args) {

        oddOrEven(7);
        oddOrEven(12);
    }

    public static void oddOrEven (int number) {
        if(number%2==0) {
            System.out.println(number + " is Even Number");
        } else {
            System.out.println(number + " is Odd Number");
        }
    }
}
