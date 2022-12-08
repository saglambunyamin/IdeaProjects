package day16_ForLoopStringPractice;

import javax.print.attribute.standard.PresentationDirection;

public class Palindrome {
    public static void main(String[] args) {

        String word = "civic";
        String reversed = "";
        int a = word.length() - 1;

        for (int i = a; i >= 0; i--) {
            reversed += word.charAt(i);
        }
        boolean isPalindrome = word.equalsIgnoreCase(reversed);
        System.out.print(word + " is Palindrome: " + isPalindrome);
    }
}
/*
"Java" ==> "avaJ"  ==> not palindrome

anna , level ==> palindrome words (has a symmetry)

 */