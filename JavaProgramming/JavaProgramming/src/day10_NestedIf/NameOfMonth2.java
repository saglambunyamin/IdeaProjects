package day10_NestedIf;

import java.sql.SQLOutput;

public class NameOfMonth2 {
    public static void main(String[] args) {

        int x = 12;

        String result=(x==1)?"JANUARY":(x==2)?"FEBRUARY":(x==3)?"MARCH":(x==4)?"APRIL"
                :(x==5)?"MAY":(x==6)?"JUNE":(x==7)?"JULY":(x==8)?"AUGUST"
                :(x==9)?"SEPTEMBER":(x==10)?"OCTOBER":(x==11)?"NOVEMBER"
                :(x==12)?"DECEMBER":"INVALID NUMBER!!!";
        System.out.println(result);

    }
}
