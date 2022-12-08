package day11_Switch_Scanner;

public class NumberOfDays {
    public static void main(String[] args) {

        int month = 2;
        int year = 2021;
        String result = "";

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                result = "31 days";
                break;
            case 2:
                if(year % 4 == 0 ) {
                    result = "29 days";
                }else {
                    result = "28 days";
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                result = "30 days";
                break;
            default:
                result = "invalid";
        }
        System.out.println(result);
    }
}
