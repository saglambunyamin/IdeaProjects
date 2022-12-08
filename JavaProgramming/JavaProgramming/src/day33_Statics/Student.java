package day33_Statics;

public class Student {

    public String name;
    public char gender;
    public int age;
    public int studentID;
    public char grade;

    public Student (String name) {
        this.name = name;
    }
    public Student (String name, char gender) {
        this(name);
        this.gender = gender;
    }
    public Student (String name, int studentID) {
        this (name);
        this.studentID = studentID;
    }
    public Student (String name, int studentID, char grade) {
        this (name, studentID);
        this.grade = grade;
    }
    public Student (String name, char gender, int age) {
        this(name, gender);
        this.age = age;
    }
    public Student (String name, char gender, int age, int studentID) {
        this (name, gender, age);
        this.studentID = studentID;
    }

    public Student(String name, char gender, int age, int studentID, char grade) {
        this (name, gender, age, studentID);
        this.grade = grade;
    }

    public String toString() {
        return "Student{" +
                "Name = '" + name + '\'' +
                ", Gender = " + gender +
                ", Age = " + age +
                ", Student ID = " + studentID +
                ", Grade = " + grade +
                '}';
    }

    public void study() {
        System.out.println(name + " is studying");
    }

}
