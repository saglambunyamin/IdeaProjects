package day32_Constructors;

public class ConstructorCalls {

    public ConstructorCalls() {
        System.out.println("Default Constructor");
    }

    public ConstructorCalls(int a) {
        this();
        System.out.println("Constructor with int argument");
    }
    public ConstructorCalls(String str) {
        this(10);
        System.out.println("Constructor with String argument");
    }

    public static void main(String[] args) {

        ConstructorCalls obj1 = new ConstructorCalls();
        System.out.println("---------------------------------------------------");

        ConstructorCalls obj2 = new ConstructorCalls(10);
        System.out.println("---------------------------------------------------");

        ConstructorCalls obj3 = new ConstructorCalls("Wooden Spoon");
        System.out.println("---------------------------------------------------");

    }



}
