package day32_Constructors;

public class Carpet {

    public double width, length, unitPrice;
    public boolean isPersian;

    public Carpet(double width, double length, double unitPrice, boolean isPersian) {
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
    }

    public double calcCost() {
        double totalPrice = (width*length)*unitPrice;
        if (isPersian) {
            totalPrice+=200;
        }
        return totalPrice;
    }

    public String toString() {
        return "Carpet{" +
                "Width = " + width +
                ", Length = " + length +
                ", Unit Price = $" + unitPrice +
                ", Is Persian = " + isPersian +
                ", Total Price = $" + calcCost() +
                '}';
    }

}
