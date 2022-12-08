package day11_Switch_Scanner;

public class NumberToWords {
    public static void main(String[] args) {

        int x = 9; //x must be between 0 and 9
        String result = (x>=0 && x<=9)? (x==0)?"ZERO":(x==1)?"ONE"
                :(x==2)?"TWO":(x==3)?"THREE":(x==4)?"FOUR"
                :(x==5)?"FIVE":(x==6)?"SIX":(x==7)?"SEVEN"
                :(x==8)?"EIGHT":"NINE": "INVALID NUMBER";

        System.out.println(result);

    }
}
