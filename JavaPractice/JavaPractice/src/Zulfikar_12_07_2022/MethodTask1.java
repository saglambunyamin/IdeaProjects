package Zulfikar_12_07_2022;

public class MethodTask1 {

    public static void countSpaces (String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                count++;
            }
        }
        System.out.println("count = " + count);
    }

    public static void main(String[] args) {
        countSpaces("this is java office hour");

    }


}
