package Zulfikar_11_16_2022;

public class StringPractice {
    public static void main(String[] args) {

        String s1 = "hat";
        String s2 = new String("hat");

        System.out.println(s1.equals(s2)); // true
        System.out.println(s1==s2); // false

        String s3 = "hat";
        System.out.println(s1==s3);  // true

        System.out.println("--------------------------------------");

        String str = "   This is a .trim method, practice  .  ".trim();
        System.out.println(str);

        str = str.replace(" ", "");
        System.out.println(str);



    }
}
