package day37_Inheritance.EmployeeTask;

public class Employee {

    public String name;
    public int age;
    public int ID;
    public char gender;
    public String jobTitle;
    public double salary;

    public void setInfo(String name, int age, int ID, char gender, String jobTitle, double salary) {
        this.name = name;
        this.age = age;
        this.ID = ID;
        this.gender = gender;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }
    public String toString() {
        return "Employee{" +
                "Name= '" + name + '\'' +
                ", Age= " + age +
                ", ID= " + ID +
                ", Gender= " + gender +
                ", JobTitle= '" + jobTitle + '\'' +
                ", Salary= $ " + salary +
                '}';
    }

    public void work () {
        System.out.println(name + " is working.");
    }

}
