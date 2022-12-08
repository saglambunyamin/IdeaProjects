package day25_Method_Overloading;
import Utilities.StringUtility;

public class Test {
    public static void main(String[] args) {

        String words = "Wooden Spoon";
        StringUtility.printEachChar(words);
        System.out.println("--------------------------------------------");

        String result = StringUtility.reverseString(words);
        System.out.println(result);
        System.out.println("-------------------------------------------");

        String word = "civic";
        boolean palindrome = StringUtility.isPalindrome(word);
        System.out.println("palindrome = " + palindrome);
        System.out.println("-------------------------------------------");

        String [] names = {"Anna", "Java", "Python", "racecar", "Mom", "Cydeo"};
        int count = 0;
        for (String each : names) {
            if(StringUtility.isPalindrome(each)) {
                count++;
            }
        }
        System.out.println("There Are " + count + " Palindrome Words");
        System.out.println("-------------------------------");

        String word1 = "abcd";
        String word2 = "adbc";
        boolean anagram = StringUtility.anagram(word1, word2);
        System.out.println("Anagram? = " + anagram);
        System.out.println("-----------------------------------");

        String s2 = "aaaaaaaaaabbbbbccccccccccddddddd";
        String nonDup = StringUtility.removeDuplicates(s2);
        System.out.println("Non Duplicated Version is = " + nonDup);
        System.out.println("--------------------------------------");



    }


}
