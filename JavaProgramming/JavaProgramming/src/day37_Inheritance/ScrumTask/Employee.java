package day37_Inheritance.ScrumTask;

public class Employee extends Person {

    public String jobTitle;
    public int ID;
    public double salary;
    public String companyName;

    public Employee (String name, int age, char gender, String jobTitle, int ID, double salary, String companyName) {
        super(name, age, gender);
        this.jobTitle = jobTitle;
        this.ID = ID;
        this.salary = salary;
        this.companyName = companyName;
    }

    public void work () {
        System.out.println(jobTitle + " " + name + " is working.");
    }

    public String toString() {
        return "Employee{" +
                ", Name= '" + name + '\'' +
                ", Age= " + age +
                ", Gender= " + gender +
                "Job Title= '" + jobTitle + '\'' +
                ", ID= " + ID +
                ", Salary= $ " + salary +
                ", Company Name= '" + companyName + '\'' +
                '}';
    }

}
