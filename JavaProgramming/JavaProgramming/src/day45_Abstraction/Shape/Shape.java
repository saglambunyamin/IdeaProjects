package day45_Abstraction.Shape;

public abstract class Shape {

    private String name;

    public String getName() {
        return name;
    }

    public Shape (String name) {
        this.name = name;
    }

    public abstract double area();
    public abstract double perimeter();

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "Name= '" + name + '\'' +
                ", Area= '" + area() + '\'' +
                ", Perimeter= '" + perimeter() + '\'' +
                '}';
    }

}
