package day47_Polymorphism;

import day44_Abstraction.Animal.Animal;
import day44_Abstraction.Animal.Cat;
import day44_Abstraction.Animal.Dog;
import day45_Abstraction.Shape.Circle;
import day45_Abstraction.Shape.Shape;
import day45_Abstraction.Shape.Square;

public class ReferenceTypeCastings {
    public static void main(String[] args) {

        Shape shape = new Circle(4);

        Animal animal = new Dog("Max", ".Husky", 'M', 3, "Small", "White");

        Dog dog = (Dog) animal;
        System.out.println("animal.getName() = " + animal.getName());
        System.out.println("dog.getName() = " + dog.getName());

        // animal.bark();
        dog.bark();
        (   (Dog) animal   ).bark();


        Shape shape1 = new Square(4);
        System.out.println("Square Side = " + ((Square) shape1).getSide());

        System.out.println("===================================================");

        Animal animal2 = new Cat("Jim", "Scottish", 'M', 2, "Small", "Brown");
        (  (Cat) animal2  ).meow();
        // (  (Dog) animal2  ).bark(); -> Gives exception error

    }
}
