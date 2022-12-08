package day34_GarbageCollection_AccessModifiers;

import java.util.ArrayList;
import java.util.Arrays;

public class Circle {

    public double radius;
    public static double pi;
    public static String name;

    public static ArrayList<Integer> numbers;

    public Circle (double radius) {
        this.radius = radius;
    }
    static {
        pi = 3.14;
        name = "Circle";
        numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(10, 20, 30));
    }
}
