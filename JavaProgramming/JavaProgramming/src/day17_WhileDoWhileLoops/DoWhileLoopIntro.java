package day17_WhileDoWhileLoops;

public class DoWhileLoopIntro {
    public static void main(String[] args) {

        boolean a = false;

        for (int i = 0; a ;) {
            System.out.println("Wooden Spoon --- For Loop");
        }
        System.out.println("-----------------------------------------");
        while(a) {
            System.out.println("Wooden Spoon --- While");
        }
        System.out.println("-----------------------------------------");

        do {
            System.out.println("Wooden Spoon --- Do While ");
        } while (a);
    }
}
