package day44_Abstraction;

public interface PropertiesOfInterface {

    int a = 100;
    static int b = 200; // static optional in interface

    /*
    public PropertiesOfInterface (int a) {
        this.a=a;
    }
    */

    /*
    static {
        b=100;
    }
     */

    /*
    public void method1 () {
        System.out.println("Instance Method");
    }
    */

    public static void method2 () {
        System.out.println("Static Method");
    }

    public abstract void metod3 ();

    public default void method4 () {
        System.out.println("Default Method");
    }


}
