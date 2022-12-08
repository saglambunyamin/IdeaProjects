package Zulfikar_12_07_2022;

public class Task3 {

    public static boolean leap (int year) {
        boolean leapYear = false;
        if (year%4 == 0 && year%100 == 0 && year%400==0) {
            leapYear = true;
        }
        return leapYear;
    }

    public static void main(String[] args) {

        System.out.println(leap(2022));
        System.out.println(leap(2000));

    }

}
