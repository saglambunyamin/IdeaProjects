package day31_Constructors;

public class Task1_SalaryObjects {
    public static void main(String[] args) {

        Task1_SalaryCalculator s1 = new Task1_SalaryCalculator(12, 40, 0.08, 0.3);

        System.out.println("s1 = " + s1);
        System.out.println("Salary Before Tax = $" + s1.salaryBeforeTax());
        System.out.println("Sate Tax = $" + s1.stateTax());
        System.out.println("Federal Tax = $" + s1.federalTax());
        System.out.println("Salary After Tax = $" + s1.salaryAfterTax());

    }
}
