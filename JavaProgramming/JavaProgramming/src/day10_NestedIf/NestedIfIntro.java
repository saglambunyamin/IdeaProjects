package day10_NestedIf;

public class NestedIfIntro {
    public static void main(String[] args) {

        int score = 60;

        if (score >= 0 && score <=100) {

            if(score >= 60) {
                System.out.println("PASSED");
            } else {
                System.out.println("FAILED");
            }
        } else {
            System.out.println("INVALID VALUE");
        }
        System.out.println("--------------------------------");

        int dayNumber = 6;

        if(dayNumber >= 1 && dayNumber <= 7){
            if (dayNumber==1) {
                System.out.println(" IT IS MONDAY");
            } else if (dayNumber==2) {
                System.out.println("IT IS TUESDAY");
            } else if (dayNumber==3) {
                System.out.println("IT IS WEDNESDAY");
            } else if (dayNumber==4) {
                System.out.println("IT IS THURSDAY");
            } else if (dayNumber==5) {
                System.out.println("IT IS FRIDAY");
            } else if (dayNumber==6) {
                System.out.println("IT IS SATURDAY");
            } else {
                System.out.println("IT IS SUNDAY");
            }
        } else {
            System.out.println("INVALID DAY NUMBER");
        }

    }
}
