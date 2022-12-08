package Zulfikar_10_26_2022;

public class SalaryAfterTax {
    public static void main(String[] args) {

        double tax = 0.15;
        int salaryJohn = 10000;
        int salaryWatson = 7000;
        int salaryMike = 12000;

        double netJohn = salaryJohn - (salaryJohn*tax);
        double netWatson = salaryWatson - (salaryWatson*tax);
        double netMike = salaryMike - (salaryMike*tax);

        System.out.println("Johns Salary is: " + netJohn);
        System.out.println("Watsons Salary is: " + netWatson);
        System.out.println("Mikes Salary is: " + netMike);

    }
}
