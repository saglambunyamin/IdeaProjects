package week12_11_26_2022.employee;

public class Employee {

    public String name;
    public int id;
    public char gender;

    public static String schoolName = "Cydeo";

    public Employee(String name) {
        this.name = name;
    }

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public Employee(String name, int id, char gender) {
        this.name = name;
        this.id = id;
        this.gender = gender;
    }

    public String toString() {
        return "Employee{" +
                "Name = '" + name + '\'' +
                ", ID = " + id +
                ", Gender = " + gender +
                ", School Name = " + schoolName +
                '}';
    }
}
