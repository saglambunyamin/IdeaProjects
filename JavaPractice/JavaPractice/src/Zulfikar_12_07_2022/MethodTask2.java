package Zulfikar_12_07_2022;

public class MethodTask2 {

    public static void totalMoney (double originalAmount, double rate, int year) {
        for (int i = 1; i <= year; i++) {
            originalAmount += originalAmount +rate*year;
        }
        System.out.println(originalAmount);
    }

    public static void main(String[] args) {
        totalMoney(120000, 0.15, 5);
    }

}
