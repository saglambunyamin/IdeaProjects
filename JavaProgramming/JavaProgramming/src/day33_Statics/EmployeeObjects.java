package day33_Statics;

public class EmployeeObjects {
    public static void main(String[] args) {

        Employee e1 = new Employee();
        e1.name = "Ahmet";
        e1.salary = 110000;

        Employee e2 = new Employee();
        e2.name = "Aygun";
        e2.salary = 115000;

        Employee e3 = new Employee();
        e3.name = "Benjamin";
        e3.salary = 120000;

        System.out.println("e1 = " + e1.name);
        System.out.println("e2 = " + e2.name);
        System.out.println("e3 = " + e3.name);
        // all equals to the last declaration --> Benjamin

        System.out.println("e1 = " + e1.salary);
        System.out.println("e2 = " + e2.salary);
        System.out.println("e3 = " + e3.salary);
        // all equals to the last declaration --> 120000

    }
}
