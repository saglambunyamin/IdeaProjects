package day37_Inheritance.AnimalTask;

public class AnimalObjects {
    public static void main(String[] args) {

        Dog dog1 = new Dog("Alex", "Husky", 'M', "Small", 1, "White" );
        System.out.println(dog1);
        dog1.bark();

        Cat cat1 = new Cat("Love", "Siamese", 'F', "Large", 2, "Brown");
        System.out.println(cat1);
        cat1.scratch();

        Parrot parrot1 = new Parrot("King", "Macaw", 'M', "Small", 3, "Blue");
        System.out.println(parrot1);
        parrot1.sing();


    }
}
