package day32_Constructors;

public class Employee {

    public String name;
    public char gender;
    public String jobTitle;
    public double salary;

    public Employee (String name) {
        this.name = name;
    }
    public Employee (String name,  char gender) {
        this(name);
        this.gender = gender;
    }
    public Employee (String name,  char gender, String jobTitle) {
        this(name, gender);
        this.jobTitle = jobTitle;
    }
    public Employee (String name,  char gender, String jobTitle, double salary) {
        this(name, gender, jobTitle);
        this.salary = salary;
    }

    public String toString() {
        return "Employee{" +
                "Name = '" + name + '\'' +
                ", Gender = " + gender +
                ", Job Title = '" + jobTitle + '\'' +
                ", Salary = $" + salary +
                '}';
    }

}
