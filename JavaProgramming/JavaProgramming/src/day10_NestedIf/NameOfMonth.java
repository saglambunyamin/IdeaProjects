package day10_NestedIf;

import java.sql.SQLOutput;

public class NameOfMonth {
    public static void main(String[] args) {

        int monthNumber = 15;
        String result = "";

        if(monthNumber >= 1 && monthNumber <= 12) {
            if (monthNumber == 1) {
                result = "IT IS JANUARY";
            } else if (monthNumber == 2) {
                result = "IT IS FEBRUARY";
            } else if (monthNumber == 3) {
                result = "IT IS MARCH";
            } else if (monthNumber == 4) {
                result = "IT IS APRIL";
            } else if (monthNumber == 5) {
                result = "IT IS MAY";
            } else if (monthNumber == 6) {
                result = "IT IS JUNE";
            } else if (monthNumber == 7) {
                result = "IT IS JULY";
            } else if (monthNumber == 8) {
                result = "IT IS AUGUST";
            } else if (monthNumber == 9) {
                result = "IT IS SEPTEMBER";
            } else if (monthNumber == 10) {
                result = "IT IS OCTOBER";
            } else if (monthNumber == 11) {
                result = "IT IS NOVEMBER";
            } else {
                result = "IT IS DECEMBER";
            }
        } else {
            result = "INVALID MONTH NUMBER";
        }
        System.out.println(result);

    }

}
