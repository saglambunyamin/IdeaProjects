package day35_Encapsulation.encapsulation;

public class EmployeeObjects {
    public static void main(String[] args) {

        Employee e1 = new Employee("Tqtiana", 'F', 28, 110000);
        System.out.println(e1);

        Employee e2 = new Employee("Benjamin", 'M', 15, 1000);
        System.out.println(e2); // because of age conditions age will be equal zero.

        Employee e3 = new Employee("Muhtar", 'L', 43, 240000);
        System.out.println(e3);
        e3.setAge(37);
        System.out.println(e3);

    }
}
