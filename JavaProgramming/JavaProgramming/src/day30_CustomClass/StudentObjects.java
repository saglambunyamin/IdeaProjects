package day30_CustomClass;

import java.util.ArrayList;

public class StudentObjects {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.setInfo("Aygun", 'F', 39, 2210, 'A' );

        Student s2 = new Student();
        s2.setInfo("Hulya", 'F', 26, 2123, 'B');

        Student s3 = new Student();
        s3.setInfo("Elminur", 'F', 26, 2210, 'A');

        Student s4 = new Student();
        s4.setInfo("Ali", 'M', 28, 5511, 'B');

        Student s5 = new Student();
        s5.setInfo("Mert", 'M', 26, 2252, 'C');

        Student [] students = {s1, s2, s3, s4, s5};
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println("------------------------------------------------------------");

        ArrayList<Student> earlyBirds = new ArrayList<>();
        ArrayList<Student> angryBirds = new ArrayList<>();

        for (Student student : students) {
            if (student.grade == 'A') {
                earlyBirds.add(student);
            } else {
                angryBirds.add(student);
            }
        }
        System.out.println("Early Birds Are: " + earlyBirds);
        System.out.println(angryBirds);
    }
}
