package day14_String;
import java.lang.String;

public class StringMethods2 {
    public static void main(String[] args) {

        String str = "Java is fun, I love learning Java";
        str = str.replace("Java" , "Python");

        System.out.println("str = " + str);

        String email = "johnsmith@yahoo.com";
        email = email.replace("yahoo" , "gmail");
        System.out.println("email = " + email);
        System.out.println("-------------------------------------------------------");

        String sentence = "Java Java Python Python C# C# C++ C++ Python Python Python Python";
        String sentence2 = sentence.replace("Python" , "");
        System.out.println("sentence = " + sentence);
        System.out.println("sentence2 = " + sentence2);
        String sentence3 = sentence2.replace("   " , " ");
        System.out.println("sentence3 = " + sentence3);
        System.out.println("-------------------------------------------------------");

        String s3 = "Java";
        s3 = s3.replace("a", "e");
        System.out.println("s3 = " + s3);
        System.out.println("-------------------------------------------------------");

        String result = "Java Java Java";
        result = result.replaceFirst("Java", "Python");
        System.out.println("result = " + result);

        String result2 = "C# is fun, C# is cool";
        result2 = result2.replaceFirst("C#", "Java");
        System.out.println("result2 = " + result2);

        String result3 = "Java";
        result3 = result3.replaceFirst("va", "vo"); //Javo
        System.out.println("result3 = " + result3);

        String result4 = result3.replaceAll("a","s");
        System.out.println("result4 = " + result4);


    }

}
