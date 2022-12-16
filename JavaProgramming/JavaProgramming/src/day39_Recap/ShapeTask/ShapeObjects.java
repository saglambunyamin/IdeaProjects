package day39_Recap.ShapeTask;

public class ShapeObjects {
    public static void main(String[] args) {

        Square s1 = new Square(12.5);
        System.out.println("s1 = " + s1);
        s1.setSide(16);
        System.out.println("s1 = " + s1);
        System.out.println("==================================================");

        Rectangle r1 = new Rectangle(15, 25);
        System.out.println("r1 = " + r1);
        System.out.println("Area = " + r1.area());
        r1.setWidth(23);
        System.out.println("r1 = " + r1);
        System.out.println("==================================================");

        Circle c1 = new Circle(15.5);
        System.out.println("c1 = " + c1);
        c1.setRadius(13.6);
        System.out.println("c1 = " + c1);

    }
}
