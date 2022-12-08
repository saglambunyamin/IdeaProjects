package day04_Variables;

public class Rectangular {
    public static void main(String[] args) {

        double length = 8.5;
        double width = 5.5;

        double area = length * width;
        double perimeter = 2 * (length + width);

        System.out.println("length = " + length + " m");
        System.out.println("width = " + width + " m");
        System.out.println("area = " + area + " m2");
        System.out.println("perimeter = " + perimeter + " m");

    }

}
