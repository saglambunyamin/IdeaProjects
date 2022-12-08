package day04_Variables;

public class Circle {

    public static void main(String[] args) {

        double PI = 3.14;
        double radius = 8;

        double diameter = 2 * radius;
        double area = PI * radius * radius;
        double perimeter = 2 * PI * radius;

        System.out.println("radius = " + radius + " m");
        System.out.println("diameter = " + diameter + " m");
        System.out.println("area = " + area + " m2");
        System.out.println("perimeter = " + perimeter + " m");

    }
}
