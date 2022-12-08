package week11_11_19_2022;

import java.time.LocalDate;

public class Student {

    public String name;
    public char gender,grade;
    public LocalDate dateOfBirth;
    public int age,studentID;

    public Student(String name, char gender, char grade, LocalDate dateOfBirth, int studentID) {
        this.name = name;
        this.gender = gender;
        this.grade = grade;
        this.age=LocalDate.now().getYear()-dateOfBirth.getYear();
        this.dateOfBirth = dateOfBirth;
        this.studentID = studentID;
    }




    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", grade=" + grade +
                ", dateOfBirth=" + dateOfBirth +
                ", age=" + age +
                ", studentID=" + studentID +
                '}';
    }

}
