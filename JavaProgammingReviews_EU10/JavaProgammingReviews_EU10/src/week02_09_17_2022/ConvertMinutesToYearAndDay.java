package week02_09_17_2022;

public class ConvertMinutesToYearAndDay {

    public static void main(String[] args) {

        int minute = 3456789;
        int day = (minute/60)/24;
        int year = day/365;
        int dayEnd = day%365;

        System.out.println(minute+" minutes is approximately "+year+" years and "+dayEnd+" days");


    }

}
