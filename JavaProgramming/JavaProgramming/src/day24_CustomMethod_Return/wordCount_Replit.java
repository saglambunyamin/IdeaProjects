package day24_CustomMethod_Return;

import java.util.Scanner;

public class wordCount_Replit {

    public static int wordCount(String words) {
        int wordCount = 1;
        for(int i=0; i<words.length(); i++) {
            char ch = words.charAt(i);
            if(ch == ' ' ){
                wordCount++;
            }
        }
        return wordCount;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(wordCount(in.nextLine()));
        String words = in.nextLine();
    }

}
