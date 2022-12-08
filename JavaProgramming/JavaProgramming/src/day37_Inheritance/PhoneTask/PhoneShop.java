package day37_Inheritance.PhoneTask;

public class PhoneShop {
    public static void main(String[] args) {

        Iphone iphone = new Iphone("Iphone 12", "6.7 inches", 1000, "Black");
        System.out.println(iphone);
        iphone.call(112);
        iphone.text(112);
        iphone.faceTime("saglambunyamin@gmail.com");
        System.out.println("============================================================================");

        Samsung samsung = new Samsung("Galaxy S19", "6 inches", 900, "White");
        System.out.println(samsung);
        samsung.call(155);
        samsung.text(155);
        samsung.freeze();
        System.out.println("============================================================================");

        Nokia nokia = new Nokia("Brick", "4 inches", 50, "Gray");
        System.out.println(nokia);
        nokia.call(187);
        nokia.text(187);
        nokia.selfDefense();



    }
}
