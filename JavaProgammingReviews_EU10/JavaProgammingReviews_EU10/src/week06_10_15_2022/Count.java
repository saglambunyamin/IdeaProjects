package week06_10_15_2022;

public class Count {
    public static void main(String[] args) {

        String str = "Java is java in everywhere is Java";
        String word = "java";
        int count = 0;
        for (int i = 0; i <= str.length() - word.length(); i++) {
            String each = str.toLowerCase().substring(i, i+word.length());
            if(each.equals(word)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
