package Zulfikar_11_23_2022;

public class ReverseString {
    public static void main(String[] args) {

        String s = "home";
        String result = "";
        for (int i = s.length()-1; i >=0; i--) {
            result +=  s.charAt(i);
        }
        System.out.println("Word is: " + s);
        System.out.println("Reversed is: " + result);
    }
}
