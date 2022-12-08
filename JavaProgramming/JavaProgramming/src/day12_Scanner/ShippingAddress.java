package day12_Scanner;
import java.util.Scanner;

public class ShippingAddress {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Your Full Name:");
        String fullName = input.nextLine();

        System.out.println("Enter Your Building Number:");
        int buildingNumber = input.nextInt();

        input.nextLine();

        System.out.println("Enter Your Street Name:");
        String streetName = input.nextLine();

        System.out.println("Enter Your City Name:");
        String cityName = input.nextLine();

        System.out.println("Enter Your State Name:");
        String stateName = input.nextLine();

        System.out.println("Enter Your Zip Code:");
        int zipCode = input.nextInt();

        input.close();

        System.out.println("Shipping Address Is:");
        System.out.println(fullName);
        System.out.println(buildingNumber+" "+streetName+" Street");
        System.out.println(cityName+", "+stateName+" "+zipCode);


    }

}
/*
1. Enter your full name ( nextLine() )
2. Enter your building number ( next() )
3. Enter your Street name ( nextLine() )
4. Enter your city name ( nextLine() )
5. Enter your state ( nextLine() )
6. Enter your zip code ( next() )
Display the shipping address
John Smith
7925 Jones Branch Dr
McLean, VA 22012
 */