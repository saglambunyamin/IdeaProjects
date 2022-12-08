package day08_IfStatements;

public class NameOfTheDay {

    public static void main(String[] args) {

        int number = 3;

        boolean a = number == 1;
        boolean b = number == 2;
        boolean c = number == 3;
        boolean d = number == 4;
        boolean e = number == 5;
        boolean f = number == 6;
        boolean g = number == 7;

        if(a) {
            System.out.println("Monday");
        }
        if(b) {
            System.out.println("Tuesday");
        }
        if(c) {
            System.out.println("Wednesday");
        }
        if(d) {
            System.out.println("Thursday");
        }
        if(e) {
            System.out.println("Friday");
        }
        if(f) {
            System.out.println("Saturday");
        }
        if(g) {
            System.out.println("Sunday");
        }

    }
}
