package day08_IfStatements;

public class NumberOfDays {

    public static void main(String[] args) {

        int month = 9;

        boolean has28Days = month == 2;
        boolean has30Days = month == 4 || month == 6 || month == 9 || month == 11;
        boolean invalid = month<=0 || month>12;
        boolean has31Days = !has28Days && !has30Days && !invalid;

        if(has28Days) {
            System.out.println("This month has 28 days.");
        }
        if(has30Days) {
            System.out.println("This month has 30 days.");
        }
        if(has31Days) {
            System.out.println("This month has 31 days.");
        }
        if(invalid) {
            System.out.println("The number you entered is invalid!");
        }

    }
}
