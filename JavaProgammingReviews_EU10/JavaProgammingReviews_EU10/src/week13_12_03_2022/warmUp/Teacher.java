package week13_12_03_2022.warmUp;

import java.time.LocalDate;

public class Teacher {

    public String name, lastName;
    public char gender;
    public LocalDate dateOfBirth;
    public int age;
    public long id;

    public Teacher(String name, String lastName, char gender, LocalDate dateOfBirth, long id) {
        this.name = name;
        this.lastName = lastName;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        int currentYear = LocalDate.now().getYear();
        int yearOfDateOfBirth = dateOfBirth.getYear();
        this.age = currentYear - yearOfDateOfBirth;
        this.id = id;
    }

    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender +
                ", dateOfBirth=" + dateOfBirth +
                ", age=" + age +
                ", id=" + id +
                '}';
    }

}
/*
    Create a class named Teacher that has the followings features:
        Attributes:
                name,lastName, gender, dateOfBirth(use LocalDate), age, id

            Methods:

                sets all the attributes of the teacher object
                toString(): returns the full info of teacher Object
 */