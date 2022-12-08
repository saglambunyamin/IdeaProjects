package day31_Constructors;

public class Task4_Item {

    public String name;
    public double unitPrice;
    public int quantity;

    public Task4_Item(String name, double unitPrice, int quantity) {
        this.name = name;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public double calcCost () {
        double cost = unitPrice * quantity;
        return cost;
    }

    public String toString() {
        return "Task4_Item{" +
                "<<Name>> '" + name + '\'' +
                ", <<Unit Price>> $ " + unitPrice +
                ", <<Quantity>> " + quantity +
                ", <<Total Price>> $ " + calcCost() +
                '}';
    }

}
