package day24_CustomMethod_Return;

import java.util.Scanner;

public class waterTax_Replit {
    public static double waterTax(double units){
        //WRITE YOUR CODE BELOW:

        double waterTax = 0;
        if(units<=50) {
            waterTax = units * 0.60;
        } else if (units>0 && units<=100) {
            waterTax = units * 0.90;
        } else if (units>100 && units<=150) {
            waterTax = (units * 0.90) + 50;
        } else {
            waterTax = (units * 0.90) + 100;
        }
        return waterTax;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(waterTax(in.nextDouble()));
        double units = in.nextDouble();
    }



}
