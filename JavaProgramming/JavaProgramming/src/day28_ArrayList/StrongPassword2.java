package day28_ArrayList;

public class StrongPassword2 {
    public static void main(String[] args) {

        String password = "cLdeo1990p";

        boolean r = password.length() >= 8 && !password.contains(" ");

        int countUpperCase = 0;
        int countLowerCase = 0;
        int countDigits = 0;
        int countSpecialChar = 0;

        for (int i = 0; i < password.length(); i++) {
            char each = password.charAt(i);

            if (Character.isUpperCase(each)){
                countUpperCase++;
            } else if(Character.isLowerCase(each))  {
                countLowerCase++;
            } else if (Character.isDigit(each)) {
                countDigits++;
            } else {
                countSpecialChar++;
            }
        }

        if (r && countUpperCase > 0 && countLowerCase > 0 && countDigits > 0 && countSpecialChar > 0) {
            System.out.println("Password is STRONG");
        } else {
            System.out.println("Try another password");
        }

    }
}
