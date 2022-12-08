package day35_Encapsulation.SquareTask;

public class Square {

    private int side;

    public Square(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }
    public void setSide(int side) {
        if (side <= 0) {
            return;
        }
        this.side = side;
    }

    public int AreaOfSquare () {
        int area = side*side;
        System.out.println("Area = " + area);
        return area;
    }
    public int PerimeterOfSquare () {
        int perimeter = 4 * side;
        System.out.println("Perimeter = " + perimeter);
        return perimeter;
    }

    public String toString() {
        return "Square{" +
                "Side = " + side +
               '}';
    }

}
