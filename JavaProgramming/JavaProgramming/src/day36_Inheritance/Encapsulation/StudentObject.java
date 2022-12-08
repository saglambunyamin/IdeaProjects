package day36_Inheritance.Encapsulation;

public class StudentObject {
    public static void main(String[] args) {

        Student s1 = new Student("Hulya", 27, 'F', 'D', "Oxford");
        System.out.println(s1);

        Student s2 = new Student("Benjamin", 97, 'M', 'E', "YTU");
        System.out.println(s2);

        s2.setAge(37);
        s2.setGrade('B');
        System.out.println(s2);

    }
}
