package day34_GarbageCollection_AccessModifiers;

import static day34_GarbageCollection_AccessModifiers.Circle.*;

public class StaticImport {
    public static void main(String[] args) {

        System.out.println("pi = " + pi);
        Circle c1 = new Circle(5);
        double c1Area = c1.radius * c1.radius * pi;
        System.out.println("c1Area = " + c1Area);

    }
}
