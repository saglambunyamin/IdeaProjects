package week05_10_08_2022;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the word");
        String s = scan.next();
        int a = s.length()-1;
        int b = s.length()-2;
        String s2 = ""+ s.charAt(b) + s.charAt(a);
        System.out.print(s2);
        System.out.print(s2);
        System.out.print(s2);
    }
}
/* Task 2: Create a logic print a new string made of 3 copies of the last 2 chars of the original string.

      Hint: The string length will be at least 2.
      input: Hello
      output: lololo
 */