package day14_String;
import java.lang.String;

public class StringMethods1 {
    public static void main(String[] args) {

        String str1 = "    batch 25     ";
        str1 = str1.trim(); //trim deletes the spaces in the beginning and end
        System.out.println(str1);
        System.out.println("-------");

        String str2 = "Cydeo School";
        int n1 = str2.indexOf("h");
        System.out.println("n1 = " + n1);

        int n2 = str2.indexOf("ool");
        System.out.println("n2 = " + n2);

        int n3 = str2.indexOf("ol");
        System.out.println("n3 = " + n3);
        System.out.println("-------");

        String str3 = "Java Programming Language";
        int n4 = str3.indexOf("an"); //take the first letter of the input and looks the a with the n
        System.out.println("n4 = " + n4);

        int n5 = str3.lastIndexOf("g");
        System.out.println("n5 = " + n5);
        System.out.println("-------");

        String s = "Java Nova Cava Wawa orange";

        int firstA = s.indexOf("a");
        System.out.println("firstA = " + firstA);

        int lastA = s.lastIndexOf("a");
        System.out.println("lastA = " + lastA);

        int secondA = s.indexOf("a ");
        System.out.println("secondA = " + secondA);

        int thirdA = s.indexOf("a C");
        System.out.println("thirdA = " + thirdA);

        //int fourthA = s.indexOf("ava W");
        //int fourthA = s.lastIndexOf("av");
        int fourthA = s.indexOf("Ca") + 1;
        System.out.println("fourthA = " + fourthA);

        //int fifthA = s.lastIndexOf("va") + 1;
        int fifthA = s.indexOf("a W");
        System.out.println("fifthA = " + fifthA);

        int sixthA = s.indexOf("aw");
        System.out.println("sixthA = " + sixthA);

        int seventhA = s.indexOf("a o");
        System.out.println("seventhA = " + seventhA);

        //int eighthA = s.lastIndexOf("a");
        int eighthA = s.indexOf("an");
        System.out.println("eighthA = " + eighthA);




    }
}
