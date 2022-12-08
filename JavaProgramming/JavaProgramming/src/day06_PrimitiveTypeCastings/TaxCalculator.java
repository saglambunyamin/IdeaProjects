package day06_PrimitiveTypeCastings;

public class TaxCalculator {

    public static void main(String[] args) {

        double income = 5000;
        double expenditure = 1775.5;
        double taxRatio = 0.18;
        double tax = (income - expenditure) * taxRatio;

        System.out.println("Your tax is $"+ tax);

    }

}
