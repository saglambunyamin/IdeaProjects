package day09_IsElseStatements.day15_ForLoops;
import java.lang.String;

public class StringMethods {
    public static void main(String[] args) {

        String str = "";

        boolean r = str.isEmpty();
        System.out.println(r);

        boolean t = str.isBlank();
        System.out.println(t);

        String str2 = "Cydeo   ";
        System.out.println(str2.isBlank());
        System.out.println("-------------------");

        String s1 = "CYDEO";
        String s2 = "cydeo";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println("-------------------");

        String sentence = "My favourite programming language is Java";

        boolean hasCSharp = sentence.contains("C#");
        boolean hasJava = sentence.contains("Java");
        boolean hasJava2 = sentence.contains("java");
        boolean hasJava3 = sentence.toLowerCase().contains("java");
        boolean hasJava4 = sentence.contains("java") || sentence.contains("Java");


        System.out.println(hasCSharp);
        System.out.println(hasJava);
        System.out.println(hasJava2);
        System.out.println(hasJava3);
        System.out.println(hasJava4);
        System.out.println("------------------------------");

        String input1 = "I love Java";
        String input2 = "Java";

        System.out.println(input1.equals(input2)); //false
        System.out.println(input1.equalsIgnoreCase(input2)); //false

        System.out.println(input1.contains("Java")); //true

        System.out.println(input1.toLowerCase().contains("java")); //true
        System.out.println(input1.toUpperCase().contains("JAVA")); //true
        System.out.println("--------------------------");

        String a = "Wooden Spoon";
        boolean x = a.startsWith("Woo"); //true
        boolean y = a.endsWith("Spoon"); //true
        boolean z = a.startsWith("wooden"); //false
        boolean c = a.toLowerCase().startsWith("wooden"); //true

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(c);

    }
}
