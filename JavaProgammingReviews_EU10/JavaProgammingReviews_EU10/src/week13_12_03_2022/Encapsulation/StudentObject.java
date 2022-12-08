package week13_12_03_2022.Encapsulation;

public class StudentObject {
    public static void main(String[] args) {

        Student student = new Student();
        student.setName("Adam");
        student.setAge(38);

        System.out.println(student);
        System.out.println("Name= " + student.getName());
        System.out.println("Age= " + student.getAge());


    }
}
