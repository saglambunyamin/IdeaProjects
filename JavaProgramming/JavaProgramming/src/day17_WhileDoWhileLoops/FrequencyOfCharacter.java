package day17_WhileDoWhileLoops;

public class FrequencyOfCharacter {
    public static void main(String[] args) {

        String str = "AAAABBBCCCC";
        char ch = 'A';
        int frequency = 0;
        for ( int i = 0; i < str.length() ; i++ ) {
            char eachChar = str.charAt(i);

            if ( eachChar == ch ) {
                frequency++;
            }
        }
        System.out.println( "Frequency of " + ch + " is: " + frequency);
    }
}
