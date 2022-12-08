package week06_10_15_2022;

public class CountWord {
    public static void main(String[] args) {

        String str = "Java is java in everywhere is Java";
        int count = 1;
        char a = ' ';
        for (int i = 0; i < str.length() ; i++) {
            if(str.charAt(i) == a) {
                count++;
            }
        }
        System.out.println(count);
    }

}
