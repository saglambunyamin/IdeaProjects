package day34_GarbageCollection_AccessModifiers;

public class AccessModifiers {

    public static int publicData = 100;
    static int defaultData = 200;
    private static int privateData = 300;

    public static void main(String[] args) {
        System.out.println("publicData = " + publicData);
        System.out.println("defaultData = " + defaultData);
        System.out.println("privateData = " + privateData);

    }


}
