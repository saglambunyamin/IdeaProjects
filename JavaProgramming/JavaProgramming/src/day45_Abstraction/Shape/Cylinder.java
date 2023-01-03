package day45_Abstraction.Shape;

public class Cylinder extends Shape implements Volume {
    private double radius;
    private double height;

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        if (radius < 0) {
            throw new RuntimeException("Invalid radius= " + radius);
        }
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        if (height < 0) {
            throw new RuntimeException("Invalid height= " + height);
        }
        this.height = height;
    }

    public Cylinder(double radius, double height) {
        super("Cylinder");
        setRadius(radius);
        setHeight(height);
    }

    @Override
    public double area() {
        return (2*3.14*radius*radius + 2*3.14*radius*height);
    }
    @Override
    public double perimeter() {
        return 2*(2*radius + height);
    }

    public double volume () {
        return (2*3.14*radius*radius*height) ;
    }



    @Override
    public String toString() {
        return "Cylinder{" +
                super.toString() +
                ", Radius= " + radius +
                ", Height= " + height +
                '}';
    }

}
