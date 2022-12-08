package day35_Encapsulation.encapsulation;

public class PersonObject {
    public static void main(String[] args) {

        Person p2 = new Person();
        p2.setName("Benjamin");
        p2.setAge(37);
        System.out.println(p2.getName() + " : " + p2.getAge());

        Person p1 = new Person();
        p1.setName("Daniel");
        p1.setAge(128);
        System.out.println(p1.getName() + " : " + p1.getAge()); // Gives "Invalid age" error.

    }
}
