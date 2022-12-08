package week09_11_05_2022;

import java.util.Scanner;

public class SpaceTrim {
    public static void main(String[] args) {

        String trimmed = trimSpace("   Cy  deo");
        System.out.println(trimmed);

    }

    public static String trimSpace(String word) {
        String result = "";
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if(ch==' ') {
                continue;
            }
            result += ch;
        }
        return result;
    }
}
