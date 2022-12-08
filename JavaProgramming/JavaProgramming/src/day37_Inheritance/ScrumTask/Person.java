package day37_Inheritance.ScrumTask;

public class Person {

    public String name;
    public int age;
    public char gender;

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void eat () {
        System.out.println(name + " is eating.");
    }
    public void drink () {
        System.out.println(name + " drinking.");
    }

    public String toString() {
        return "Person{" +
                "Name= '" + name + '\'' +
                ", Age= " + age +
                ", Gender= " + gender +
                '}';
    }
}
