package week04_10_01_2022;

public class CharacterType {
    public static void main(String[] args) {

        char ch = '7';

        boolean isUpperCase = ch >= 'A' && ch <= 'Z';
        boolean isLowerCase = ch >= 'a' && ch <= 'z';
        boolean isNotAlphabetic = !isUpperCase && !isLowerCase;
        if(isUpperCase) {
            System.out.println(ch+ " is an Upper Case Character");
        }

         if (isLowerCase) {
            System.out.println(ch+ " is an Lower Case Character");
        }

         if (isNotAlphabetic){
            System.out.println(ch+ " is not an Alphabetic Character");
        }

    }
}

/* Given a character, the task is to check whether the given character is in upper case,
lower case, or non-alphabetic         character

                            Input: ch = 'A'
                            Output: A is an UpperCase character

                            Input: ch = 'a'
                            Output: a is an LowerCase character

                            Input: ch = '0'
                            Output: 0 is not an aplhabetic character

 */