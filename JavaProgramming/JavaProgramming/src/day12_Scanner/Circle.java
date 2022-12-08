package day12_Scanner;
import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {

        Scanner radius = new Scanner(System.in);
        System.out.println("Enter radius value:");
        int r = radius.nextInt();
        double area = 3.14 * r * r;
        double perimeter = 2 * 3.14 * r;

        System.out.println("Area = "+area);
        System.out.println("Perimeter = "+perimeter);

        radius.close();
    }
}
