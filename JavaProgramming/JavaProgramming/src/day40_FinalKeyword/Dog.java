package day40_FinalKeyword;

public class Dog extends Animal {

    public Dog(String name, String breed, char gender, String color, String size, int age) {
        super(name, breed, gender, color, size, age);
    }

    public static void main(String[] args) {

    Dog dog1 = new Dog("Max", "Terrier", 'M', "Gray", "Small", 2);

    dog1.setName("Benji");
        System.out.println(dog1);
    }
    public void eat() {
        System.out.println(getName() + " is eating dog food");
    }
    /* public void drink() {
        System.out.println(getName() + " is drinking beer");
    } */


}