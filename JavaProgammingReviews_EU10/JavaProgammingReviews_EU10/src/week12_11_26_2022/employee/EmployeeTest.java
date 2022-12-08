package week12_11_26_2022.employee;

public class EmployeeTest {
    public static void main(String[] args) {

        // Constructer Overloading
        // Constructer name must be same with the class name
        // Constructer doesn't have return method

        Employee employee1 = new Employee("Zulpikar");
        Employee employee2 = new Employee("Nadir", 2323);
        Employee employee3 = new Employee("Adam", 3844, 'M');

        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);

    }
}
