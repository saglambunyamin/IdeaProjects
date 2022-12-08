package day36_Inheritance.Animals;

public class Zoo {
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.setInfo("Max", "Husky", 'M', "Small", 2, "White");
        System.out.println(dog);
        dog.eat();
        dog.drink();
        dog.sleep();
        dog.move();

        dog.bark();
        System.out.println("========================================================================");

        Cat cat = new Cat();
        cat.setInfo("Tarcin", "British", 'M', "Small", 3, "Brown");
        System.out.println(cat);
        cat.eat();
        cat.drink();
        cat.sleep();
        cat.move();

        cat.meow();
        System.out.println("========================================================================");

        Tiger tiger = new Tiger();
        tiger.setInfo("Shery", "Bengal", 'M', "Large", 4, "Orange");
        System.out.println(tiger);
        tiger.eat();
        tiger.drink();
        tiger.sleep();
        tiger.move();

        tiger.hunt();
        tiger.roar();



    }
}
