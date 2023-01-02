package day44_Abstraction.Animal;

public final class Cat extends Animal implements Playable {
    public Cat(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    public void meow () {
        System.out.println(getName() + " is meowing");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating Biriyani");
    }

    public void play() {
        System.out.println(getName() + " is playing with the bone");
    }
}
