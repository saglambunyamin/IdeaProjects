package day36_Inheritance.Encapsulation;

public class Student {

    private String name;
    private int age;
    private char gender;
    private char grade;
    private String schoolName;

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public char getGender() {
        return gender;
    }
    public char getGrade() {
        return grade;
    }
    public String getSchoolName() {
        return schoolName;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        if ( age < 5 || age > 90 ) {
            return;
        }
        this.age = age;
    }
    public void setGender(char gender) {
        if ( ! ( gender == 'F' || gender == 'M' )  ) {
            return;
        }
        this.gender = gender;
    }
    public void setGrade(char grade) {
        if ( ! ( grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D' || grade == 'F'  ) ) {
            return;
        }
        this.grade = grade;
    }
    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public void study() {
        System.out.println(name + " is studying");
    }

    public Student(String name, int age, char gender, char grade, String schoolName) {
        setName(name);
        setAge(age);
        setGender(gender);
        setGrade(grade);
        setSchoolName(schoolName);
    }
    public String toString() {
        return "Student{" +
                "Name: '" + name + '\'' +
                ", Age: " + age +
                ", Gender: " + gender +
                ", Grade: " + grade +
                ", School Name: '" + schoolName + '\'' +
                '}';
    }

}
