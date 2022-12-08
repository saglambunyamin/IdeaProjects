package day12_Scanner;
import java.util.Scanner;

public class ScannerPractice {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number between 1 to 7:");
        int dayNumber = scan.nextInt();
        String result = "";

        if(dayNumber>=1 && dayNumber<=7) {

            switch (dayNumber) {
                case 1:
                    result = "Monday";
                    break;
                case 2:
                    result = "Tuesday";
                    break;
                case 3:
                    result = "Wednesday";
                    break;
                case 4:
                    result = "Thursday";
                    break;
                case 5:
                    result = "Friday";
                    break;
                case 6:
                    result = "Saturday";
                    break;
                default:
                    result = "Sunday";
            }
        } else {
            result = "Invalid Number!!!";
        }
        System.out.println("YOUR DAY IS: " + result);
        scan.close();
    }
}
