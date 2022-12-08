package week06_10_15_2022;

public class PrintEachWord {
    public static void main(String[] args) {

        String str = "Java is java in everywhere is Java";
        String temp = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                temp += str.charAt(i);
            }
            if(str.charAt(i) == ' ') {
                System.out.println(temp);
                temp = "";
            }
        }
        System.out.println(temp);
    }
}
