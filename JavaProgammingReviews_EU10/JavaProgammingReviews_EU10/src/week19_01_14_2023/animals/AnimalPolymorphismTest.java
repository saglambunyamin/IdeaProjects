package week19_01_14_2023.animals;

public class AnimalPolymorphismTest {
    public static void main(String[] args) {
        //implement polymorphism
        // ParentClass reference = new SubClassConstructor();
        Animal animal = new Bird();
        animal.move();
        animal = new Cow();
        animal.move();

        System.out.println("===============================================");

        // reference typecasting
        Animal animal1 = new Bird();
        ((Bird) animal1).hunt();



    }

}
