package day24_CustomMethod_Return;

public class Return_vs_ExitMethod {
    public static void main(String[] args) {
        nameOfMonth(50);
        System.out.println("Hello World");
    }
    public static void nameOfMonth(int number)  {

        if (number < 1 || number > 12) {
            System.out.println("Invalid");
            // return; //when we use return Hello World will be printed.
            System.exit(0); // when we use System.exit Hello World will not be printed.
        }
        String name = (number == 1) ? "January" : (number == 2) ? "February" : (number == 3) ? "March" : (number == 4) ? "April" : (number == 5) ? "May" : (number == 6) ? "June" : (number == 7) ? "July" : (number == 8) ? "August" : (number == 9) ? "September" : (number == 10) ? "October" : (number == 11) ? "November" : "December";

        System.out.println("Month Name is: " + name);

    }
}
