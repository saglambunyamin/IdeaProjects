package week05_10_08_2022;

public class StringMethods {
    public static void main(String[] args) {

        String str = "Adam";
        System.out.println(str.charAt(0));

        System.out.println("length = " + str.length());

        int lengthOfTheString = str.length();
        int indexOfLastChar = lengthOfTheString - 1;
        System.out.println(str.charAt(indexOfLastChar));

        System.out.println(str.toLowerCase());

        System.out.println(str.toUpperCase());

        System.out.println("---------------------------------------------------");
        String str1 = "        Galatasaray          ";
        System.out.println(str1.trim());
        System.out.println("---------------------------------------------------");

        String number = "0123456";
        System.out.println(number.indexOf('3'));
        System.out.println(number.indexOf("34")); // 3 -> 012'34'56
        System.out.println(number.indexOf("56")); // 5 -> 01234'56'
        System.out.println(number.indexOf("14")); //-1 because it is not exist
        System.out.println("---------------------------------------------------");

        String sentence = "Java is a programming language";
        System.out.println(sentence.indexOf("programming"));

        String s2 = "Java is Java";
        System.out.println(s2.indexOf("Java"));
        System.out.println(s2.lastIndexOf("Java"));
        System.out.println("---------------------------------------------------");

        String s3= "Java is a hard Programming Language";
        System.out.println(s3.replace("hard", "easy"));

        String s4 = "Java is not same with Java";
        System.out.println(s4.replaceFirst("Java", "C#"));
        System.out.println(s4.replaceAll("Java", "C#"));
        System.out.println("------------------------------------------------------");

        String subs = "Cydeo";
        System.out.println(subs.substring(0,5));
        System.out.println("------------------------------------------------------");

        String s5 = "Adam";
        System.out.print((s5 + " ").repeat(10));
        System.out.println("\n-------------------------------------------------------------------------");

        String s6 = " ";
        System.out.println(s6.isEmpty());
        System.out.println(s6.isBlank());
        System.out.println("------------------------------------------------------");

        String s7 = "Word";
        String s8 = "word";
        System.out.println(s7.equals(s8));
        System.out.println(s7.equalsIgnoreCase(s8));
        System.out.println("------------------------------------------------------");

        String s9 = "Java is a good language";
        System.out.println(s9.startsWith("Java"));
        System.out.println(s9.endsWith("language"));
        System.out.println(s9.endsWith("good"));
        System.out.println("------------------------------------------------------");

    }
}
