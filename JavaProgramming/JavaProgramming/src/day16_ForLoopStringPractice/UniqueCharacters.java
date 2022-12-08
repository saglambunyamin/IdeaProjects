package day16_ForLoopStringPractice;

import java.util.Scanner;

public class UniqueCharacters {
    public static void main(String[] args) {

       Scanner input = new Scanner(System.in);
        System.out.println("Enter The Word");
       String str = input.nextLine();
       String result = "";

            for( int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if ( str.indexOf(ch) == str.lastIndexOf(ch) ) {
                    result += ch;
                }
            }
            System.out.println("Unique Characters Of The Word: " + result);
        }
    }
/*
3. Write a program that can return the unique characters from a String
			Ex:
				input:
					AABCCD
				output:
					BD
			Hint: You will need indexOf() and lastIndexOf()
				  if the first and last index numbers of the character are same, then it's unique
 */
