package week10_11_12_2022;

import java.util.Arrays;

public class Task4_HidePassword {
    public static void main(String[] args) {
        String [] arr = {"one", "hi", "hold"};

        String [] hide = hidePassword(arr);
        System.out.println(Arrays.toString(hide));
    }

    public static String [] hidePassword (String [] arr) {
        String [] results = new String[arr.length];
        int index = 0;
        for (String s : arr) {
            String result = convertLetterToStar(s);
            results[index++] = result;
        }
        return results;
    }

    public static String convertLetterToStar (String s) {
        String temp = "";
        for (int i = 0; i < s.length(); i++) {
            temp += "*";
        }
        return temp;
    }
}
