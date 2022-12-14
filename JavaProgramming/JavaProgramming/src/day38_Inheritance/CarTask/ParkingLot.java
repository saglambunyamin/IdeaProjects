package day38_Inheritance.CarTask;

public class ParkingLot {
    public static void main(String[] args) {

    Toyota to1 = new Toyota("Camry", 2020, 20000, "Gray", 15000);

    Tesla te1 = new Tesla("Model S", 2022, 94990, "Red", 0);

    BMW bmw1 = new BMW("X5", 2020, 67350, "Black", 12000);

        System.out.println(to1);
        to1.start();
        System.out.println(te1);
        te1.start();
        System.out.println(bmw1);
        bmw1.start();

    }
}
