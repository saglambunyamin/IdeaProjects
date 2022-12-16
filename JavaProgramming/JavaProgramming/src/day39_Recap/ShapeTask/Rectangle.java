package day39_Recap.ShapeTask;

public class Rectangle extends Shape {

    private double length, width;

    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        if (length <= 0) {
            System.err.println("Invalid side value: " + length);
        }
        this.length = length;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        if (width <= 0) {
            System.err.println("Invalid side value: " + width);
        }
        this.width = width;
    }

    public Rectangle(double length, double width) {
        super("Rectangle");
        setLength(length);
        setWidth(width);
    }

    @Override
    public double area() {
        return length * width;
    }
    @Override
    public double perimeter() {
        return 2 * ( length + width );
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "Length= " + length +
                ", Width= " + width +
                "Area: '" + area() + '\'' +
                "Perimeter: '" + perimeter() + '\'' +
                '}';
    }

}
