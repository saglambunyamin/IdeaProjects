package day33_Statics;

public class Iphone {

    public static String brand = "Apple";
    public String model;
    public double price;
    public static String OperatingSystem = "iOS";
    public String color;

    public static void printOS () {
        System.out.println(OperatingSystem);
        // System.out.println(model); you can not use instance variable in a static method!
    }


}
