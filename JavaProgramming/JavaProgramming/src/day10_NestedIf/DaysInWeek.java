package day10_NestedIf;

public class DaysInWeek {
    public static void main(String[] args) {

        int n = 4;

        String result = (n==1)? "Monday":(n==2)? "Saturday" :(n==3)?"Wednesday"
                :(n==4)?"Thursday":(n==5)?"Friday":(n==6)?"Saturday":"Sunday";
        System.out.println(result);

    }
}
