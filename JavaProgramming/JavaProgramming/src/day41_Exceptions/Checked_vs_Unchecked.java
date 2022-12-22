package day41_Exceptions;

import day36_Inheritance.Encapsulation.Student;

public class Checked_vs_Unchecked {
    public static void main(String[] args) {

        // unchecked exception:
        int a = 10;
        int b = 0;
        //System.out.println(  a/b  );

        char [] characters = {'A', 'B', 'C'};
        //System.out.println(characters[99]);

        Student student = null;
        //System.out.println(student.getAge());

        String str = "Wooden Spoon";
        str = null;
        //System.out.println(str.toUpperCase());

        String str2 = ""; // object != null
        //System.out.println(str.isEmpty());

        // Checked exception:

        System.out.println("Hello");
       // Thread.sleep(3000);
        System.out.println("Cydeo");


    }
}
