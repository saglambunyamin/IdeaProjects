package day35_Encapsulation.SquareTask;

public class SquareObjects {
    public static void main(String[] args) {

        Square s1 = new Square(5);
        System.out.println(s1);
        s1.AreaOfSquare();
        s1.PerimeterOfSquare();

        Square s2 = new Square(-3);
        System.out.println(s2);
        s2.AreaOfSquare();
        s2.PerimeterOfSquare();

    }
}
