package day38_Inheritance.CarTask;

public class Toyota extends Car {

    public Toyota (String model, int year, double price, String color, int miles) {
        super("Toyota", model, year, price, color, miles);
    }
    public void reliable () {
        System.out.println(brand + " " + model + " is reliable");
    }



}
