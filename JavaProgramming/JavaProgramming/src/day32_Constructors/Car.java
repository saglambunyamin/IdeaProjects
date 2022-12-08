package day32_Constructors;

public class Car {

    public String brand, model;
    public int year;
    public double price;
    public String color;

    public Car (String brand) {
        this.brand = brand;
    }
    public Car (String brand, String model) {
        this(brand);
        this.model = model;
    }
    public Car (String brand, String model, int year) {
        this(brand, model);
        this.year = year;
    }
    public Car (String brand, String model, int year, double price) {
        this(brand, model, year);
        this.price = price;
    }
    public Car (String brand, String model, int year, double price, String color) {
        this(brand, model, year, price);
        this.color = color;
    }

    public String toString() {
        return "Car{" +
                "Brand = '" + brand + '\'' +
                ", Model = '" + model + '\'' +
                ", Year = " + year +
                ", Price = $" + price +
                ", Color = '" + color + '\'' +
                '}';
    }
}
