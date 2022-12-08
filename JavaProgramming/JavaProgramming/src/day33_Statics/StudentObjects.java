package day33_Statics;

import java.util.Arrays;

public class StudentObjects {
    public static void main(String[] args) {

        Student s1 = new Student("Ahmet");
        System.out.println(s1);

        Student s2 = new Student("Aygun", 'F');

        Student s3 = new Student("Nigara", 11);

        Student s4 = new Student("Mert", 12, 'A');

        Student s5 = new Student("Cihad", 'M', 28);

        Student s6 = new Student("Suhaib", 'M', 27, 15);

        Student s7 = new Student("Ali", 'M', 42, 30, 'A');

        System.out.println("===================================================");
        Student [] students = {s1, s2, s3, s4, s5, s6, s7};
        System.out.println(Arrays.toString(students));

    }
}
