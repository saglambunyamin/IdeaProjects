package day31_Constructors;

public class Task1_SalaryCalculator {

    public double hourlyRate, weeklyHours, stateTaxRate, federalTaxRate;

    public Task1_SalaryCalculator(double hourlyRate, double weeklyHours, double stateTaxRate, double federalTaxRate) {
        this.hourlyRate = hourlyRate;
        this.weeklyHours = weeklyHours;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;
    }

    public double salaryBeforeTax() {
        double salary = hourlyRate * weeklyHours*4;
        return salary;
    }
    public double stateTax() {
        double stateTax = salaryBeforeTax()*stateTaxRate;
        return stateTax;
    }
    public double federalTax() {
        double federalTax = salaryBeforeTax()*federalTaxRate;
        return federalTax;
    }
    public double salaryAfterTax() {
        double netSalary = salaryBeforeTax()-(stateTax()+federalTax());
        return netSalary;
    }

    public String toString() {
        return "Task1_SalaryCalculator{" +
                "Hourly Rate = $" + hourlyRate +
                ", Weekly Hours = " + weeklyHours +
                ", State Tax Rate = %" + stateTaxRate +
                ", Federal Tax Rate = %" + federalTaxRate +
                '}';
    }
}
