package week06_10_15_2022;

public class CountWordWithWhile {
    public static void main(String[] args) {

        String str = "Java is java in everywhere is Java";
        str = str.toLowerCase();
        String word = "java";
        int count = 0;
        while (str.contains(word)) {
            count++;
            str = str.replaceFirst(word, "");
        }
        System.out.println(count);
    }
}
