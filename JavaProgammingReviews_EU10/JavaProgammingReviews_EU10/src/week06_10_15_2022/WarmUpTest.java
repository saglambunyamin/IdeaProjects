package week06_10_15_2022;

public class WarmUpTest {
    public static void main(String[] args) {

        String word = "Code";
        String temp = "";

        for (int i = 0; i <= word.length(); i++) {
            String str = word.substring(0,i);
            System.out.println("str = " + str);
            temp += str;
        }
        System.out.println(temp);
    }
}
