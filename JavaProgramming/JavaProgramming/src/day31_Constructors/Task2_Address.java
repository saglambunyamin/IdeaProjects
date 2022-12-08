package day31_Constructors;

public class Task2_Address {
    
    public int buildingNumber, zipCode;
    public String street, city, state;

    public Task2_Address(int buildingNumber, int zipCode, String street, String city, String state) {
        this.buildingNumber = buildingNumber;
        this.zipCode = zipCode;
        this.street = street;
        this.city = city;
        this.state = state;
    }

    public String toString() {
        return buildingNumber+" "+street+"\n"+city+" "+state+" "+zipCode;
    }
}
