package week10_11_12_2022;

public class FindTheWord {
    public static void main(String[] args) {

        String str = "(((W&e**_lco73me %T%o Co!@$,,<r>e <J>>>$@av^453a";
        String result = "";

        /*
        for ( int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                result += ch;
            }
            if (ch >= 'a' && ch <= 'z') {
                result += ch;
            }
            if (ch == ' ') {
                result += ch;
            }
        }
           */

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLetter(ch)) {
                result += ch;
            }
            if (ch == ' ') {
                result += ch;
            }
        }

            System.out.println("result = " + result);

    }
}