package day30_CustomClass;

public class CapitalOne {
    public static void main(String[] args) {

        Employee e1 = new Employee();
        e1.setInfo("John", 'M', 25, 2237, "Developer", 100000, true);

        Employee e2 = new Employee();
        e2.setInfo("Anna", 'F', 28, 2287, "QA", 85000, true );

        Employee e3 = new Employee();
        e3.setInfo("David", 'M', 35, 2256, "QA", 45000, false);

        Employee e4 = new Employee();
        e4.setInfo("Lina", 'F', 45, 2290, "Manager", 80000, true);

        Employee e5 = new Employee();
        e5.setInfo("Kevin", 'M', 35, 2298, "Senior QA", 110000, true);

        Employee [] employees = {e1, e2, e3, e4, e5};
        int countFullTime = 0;
        int countPartTime = 0;
        double max = employees[0].salary;
        double min = employees[0].salary;

        for (Employee employee : employees) {
            if (employee.isFullTime) {
                countFullTime++;
            } else {
                countPartTime++;
            }
            if (employee.salary > max) {
                max = employee.salary;
            }
            if (employee.salary < min) {
                min = employee.salary;
            }
        }

        System.out.println("countFullTime = " + countFullTime);
        System.out.println("countPartTime = " + countPartTime);
        System.out.println("max = " + max);
        System.out.println("min = " + min);



    }
}
