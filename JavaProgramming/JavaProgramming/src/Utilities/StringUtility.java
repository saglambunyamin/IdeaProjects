package Utilities;

import java.util.Arrays;

public class StringUtility {
     public static void printEachChar(String str){

        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }

    }

    public static String reverseString (String str) {
        String result = "";
            for (int i = str.length()-1; i >= 0  ; i--) {
            result+= str.charAt(i);
            }
            return result;
    }

    public static boolean isPalindrome(String str) {
        return reverseString(str).equalsIgnoreCase(str);
        }

    public static boolean anagram (String str1, String str2) {
        char [] ch1 = str1.toCharArray();
        char [] ch2 = str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        return Arrays.equals(ch1, ch2);
    }

    public static String removeDuplicates ( String str ) {
         String result = "";
        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);
            if(!result.contains(""+each)) {
                result += each;
            }
        }
        return result;
    }

public static boolean isStrongPassword (String password) {

    boolean r1 = password.length() >= 8 && !password.contains(" ");
    boolean r2 = false; // has upper case letter ?
    boolean r3 = false; // has lower case letter ?
    boolean r4 = false; // has special character ?
    boolean r5 = false; // has digit ?

    char [] chars = password.toCharArray();
    for (char each : chars) {
        if (Character.isUpperCase(each)) {
            r2 = true;
        } else if (Character.isLowerCase(each)) {
            r3 = true;
        }else  if (Character.isDigit(each)) {
            r5 = true;
        } else {
            r4 = true;
        }
    }
    boolean isStrongPasword = r1 && r2 && r3 && r4 && r5;
    return isStrongPasword;
}

}


