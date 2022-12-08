package day19_LoopPractices;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {

        while(true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("How much you make an hour?");
            double hourlyRate = scan.nextDouble();
            if(hourlyRate <= 0) {
                System.out.println("Invalid Entry for Hourly Rate");
                System.exit(0);
            }
            System.out.println("How many hours do you work per week?");
            double weeklyHour = scan.nextDouble();
            if( ! (weeklyHour >=1 && weeklyHour <= 144) ) {
                System.out.println("Invalid Entry for Weekly Hours");
                System.exit(0);
            }
            System.out.println("Enter your state tax rate");
            double taxRate = scan.nextDouble();
            if ( ! (taxRate >= 0 && taxRate <= 10) ) {
                System.out.println("Invalid Entry for state tax Rate");
                System.exit(0);
            }
            double grossSalary = 4*weeklyHour*hourlyRate;
            double stateTax = taxRate/100;
            double totalTax = 0.26 + stateTax;
            double netIncome = grossSalary - (grossSalary*totalTax);

            System.out.println("Gross Salary: " + grossSalary);
            System.out.println("Federal Tax: 0.26");
            System.out.println("State Tax: "+ stateTax);
            System.out.println("Total Tax: " + totalTax);
            System.out.println("Net Income: " + netIncome);

            System.out.println("Would You Like To Continue? (yes/no)");
            String answer = scan.next();

            if(!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no") ) ) {
                System.err.println("Invalid Entry. Please Retry");
                answer = scan.next();
            }
            if(answer.equalsIgnoreCase("no")) {
                System.out.println("Thank you for using Cydeo Salary Calculator APP");
                System.exit(0);
            }






        }

    }

}
