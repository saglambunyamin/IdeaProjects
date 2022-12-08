package day24_CustomMethod_Return;

import java.util.Scanner;

public class reserveString_Replit {
    public static String reverse(String input){

        String reserve = "";
        for(int i=input.length()-1; i>=0; i--){
        reserve+=input.charAt(i);

    }
        return reserve;
}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(reverse(in.next()));
        String input = in.next();
    }
}
