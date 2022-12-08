package day37_Inheritance;

class A {
    public A () {
        System.out.println("A");
    }
}

class B extends A {
    public B () {
        System.out.println("B");
    }
}

public class ConstructorPractice {
    public static void main(String[] args) {

        B obj = new B();
        System.out.println(obj);

    }
 }
