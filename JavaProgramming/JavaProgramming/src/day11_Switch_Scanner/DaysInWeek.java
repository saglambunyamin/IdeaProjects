package day11_Switch_Scanner;

public class DaysInWeek {
    public static void main(String[] args) {

        int number = 3;
        String result = "";


        switch (number) {
            case 1:
                result = "MONDAY";
            break;
            case 2:
                result = "TUESDAY";
                break;
            case 3:
                result = "WEDNESDAY";
                break;
            case 4:
                result = "THURSDAY";
                break;
            case 5:
                result = "FRIDAY";
                break;
            case 6:
                result = "SATURDAY";
                break;
            case 7:
                result = "SUNDAY";
                break;
            default:
                result = "INVALID NUMBER";
        }

        System.out.println("DAY IS "+result);

    }
}
