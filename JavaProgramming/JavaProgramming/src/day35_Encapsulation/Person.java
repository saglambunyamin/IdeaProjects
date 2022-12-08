package day35_Encapsulation;

public class Person {

    public String name;
    public int age;
    public char gender;
    public String language;

    public static String planet;
    public static boolean isHuman, hasNose;
    public static int numberOfWings, numberOfHead;

    public Person(String name, int age, char gender, String language) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.language = language;
    }

    static {
        planet = "World";
        isHuman = true;
        hasNose = true;
        numberOfWings = 0;
        numberOfHead = 1;
    }

    public static void printPlanetName () {
        System.out.println("Planet Name Is << " + planet + " >>");
    }
    public void eat (String food) {
        System.out.println(name + " is eating << " + food + " >>");
    }
    public void drink (String drink) {
        System.out.println(name + " is drinking << " + drink + " >>");
    }

    public String toString() {
        return "Person{" +
                "Name: '" + name + '\'' +
                ", Age: " + age +
                ", Gender: " + gender +
                ", Language: '" + language + '\'' +
                ", Planet: '" + planet + '\'' +
                ", Is Human: '" + isHuman + '\'' +
                ", Has Nose: '" + hasNose + '\'' +
                ", Number Of Wings: " + numberOfWings +
                ", Number Of Head: " + numberOfHead +
                '}';
    }

}
