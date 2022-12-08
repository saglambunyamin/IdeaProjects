package day24_CustomMethod_Return;

import java.util.Scanner;

public class ReturnMethodIntro {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Your Word");
        String str = scan.next();
        String result =  reverse(str);

        if(str.equalsIgnoreCase(result) ) {
            System.out.println(str + " is palindrome");
        } else {
            System.out.println(str + " is not palindrome");
        }
        }

        public static String reverse(String str) {
        String reverse = "";

        for (int i = str.length()-1; i >= 0 ; i--) {
        reverse += str.charAt(i);
            }
            return reverse;
        }

}
