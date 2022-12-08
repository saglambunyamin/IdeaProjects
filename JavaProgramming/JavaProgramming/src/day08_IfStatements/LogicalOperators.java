package day08_IfStatements;

public class LogicalOperators {

    public static void main(String[] args) {

        String name = "Steven";
        int age = 17;
        String citizen = "USA";

        boolean isEligible = age >= 18 && citizen == "USA";

        System.out.println(name+" is elligible to vote: " + isEligible);
        System.out.println("------------------------------------------");

        String name2 = "Josh";

        int creditScore = 720;
        int age2 = 23;
        int income = 40000;

        boolean isEligible2 = creditScore >= 700 && age2 >= 21 && income >= 60000;

        System.out.println(name2+" is eligible for loan: "+isEligible2);
        System.out.println("------------------------------------------");

        String name3 = "Shay";
        int age3 = 21;
        char gender ='F';

        boolean isEligible3 = age3 >= 18 &&(gender == 'M' || gender == 'F');

        System.out.println(name3+" is eligible to register: "+isEligible3);
        System.out.println("------------------------------------------");

        String name4 = "James";
        String countryOfBirth = "UK";
        boolean marriedToUSCitizen = true;

        boolean isEligible4 = countryOfBirth == "USA" || marriedToUSCitizen == true;

        System.out.println(name4+" is eligible to apply for US citizenship: "+isEligible4);
        System.out.println("------------------------------------------");

        int score = 85;
        boolean passed = score >= 60;
        boolean failed = !passed;

        System.out.println("passed = " + passed);
        System.out.println("failed = " + failed);

    }
}
