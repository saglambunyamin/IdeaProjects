package week12_11_26_2022.statics;

public class StaticWorkStyle {

    static {
        System.out.println("First Static");
    }
    static {
        System.out.println("Second Static");
    }

    public static void main(String[] args) {
        System.out.println("Main Method");
    }

    public static void methodStatic () { // if you don't call this method, it never runs
                                                        // but static blocks automatically run
    }

    static {
        System.out.println("Third Static");
    }

}
