package day09_IsElseStatements;

public class NameOfTheDay {

    public static void main(String[] args) {

        int n = 8;

        boolean isMonday = n == 1;
        boolean isTuesday = n == 2;
        boolean isWednesday = n == 3;
        boolean isThursday = n == 4;
        boolean isFriday = n == 5;
        boolean isSaturday = n == 6;
        boolean isSunday = n == 7;

        if(isMonday) {
            System.out.println("Monday");
        } else if(isTuesday) {
            System.out.println("Tuesday");
        } else if(isWednesday) {
            System.out.println("Wednesday");
        } else if(isThursday) {
            System.out.println("Thursday");
        }else if(isFriday) {
            System.out.println("Friday");
        }else if(isSaturday) {
            System.out.println("Saturday");
        }else if(isSunday) {
            System.out.println("Sunday");
        }else {
            System.out.println("Invalid Number");
        }

    }
}
