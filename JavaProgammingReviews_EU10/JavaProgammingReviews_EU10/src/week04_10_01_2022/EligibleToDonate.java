package week04_10_01_2022;
import java.util.Scanner;

public class EligibleToDonate {
    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);

        System.out.println("Please Enter Your Age");
        int age = x.nextInt();

        System.out.println("Please Enter Your Weight");
        double weight = x.nextDouble();

        String result = "";

        if(age >= 0 && weight >= 0) {
            if (age >= 18 && weight > 50) {
                result = "You are eligible to donate blood";
            } else if (age >= 18 && weight <= 50) {
                result = "You are not eligible to donate blood";
            } else {
                result = "Age must be greater than 18";
            }
        } else {
            result = "Invalid Number";
        }

        System.out.println(result);


    }

}
/*
Create a program that accepts age and weight(kg) as int.

If age greater than or equal 18 and weight greater than 50 kg give a message
EXPECTED  :  "You are eligible to donate blood"

If age greater than or equal 18 and weight smaller or equal than 50 kg give a message
EXPECTED  :  "You are not eligible to donate blood"

If age is smaller than 18 "Age must be greater than 18"
EXPECTED  :  "Age must be greater than 18"
 */
