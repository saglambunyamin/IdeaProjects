package day43_Abstraction.Employee;

public class Teacher extends Employee {

    public Teacher(String name, int age, char gender, int ID, String jobTitle, double salary) {
        super(name, age, gender, ID, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getName() + " is teaching");
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " sleeps 7 hours");
    }


}
