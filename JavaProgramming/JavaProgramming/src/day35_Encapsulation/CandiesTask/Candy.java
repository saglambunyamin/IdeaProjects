package day35_Encapsulation.CandiesTask;

public class Candy {

    private String brand;
    private int quantity;
    private double price;
    private boolean hasPeanuts;

    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        if (quantity <= 0) {
            throw new RuntimeException("quantity can not be zero or negative");
        }
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        if (price < 0) {
            throw new RuntimeException("Price  can not be negative");
        }
        this.price = price;
    }

    public boolean isHasPeanuts() {
        return hasPeanuts;
    }
    public void setHasPeanuts(boolean hasPeanuts) {
        this.hasPeanuts = hasPeanuts;
    }

    public Candy(String brand, int quantity, double price, boolean hasPeanuts) {
        setBrand(brand);
        setQuantity(quantity);
        setPrice(price);
        setHasPeanuts(hasPeanuts);
    }

    public String toString() {
        return "Candy{" +
                "Brand: '" + brand + '\'' +
                ", Quantity: " + quantity +
                ", Price: " + price +
                ", Has Peanuts: " + hasPeanuts +
                '}';
    }

}
