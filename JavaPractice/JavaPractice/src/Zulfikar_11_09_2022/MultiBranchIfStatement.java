package Zulfikar_11_09_2022;

public class MultiBranchIfStatement {
    public static void main(String[] args) {

        int diameter = 25;

        if (diameter==25) {
            System.out.println("This is a basketball.");
        } else if (diameter == 15) {
            System.out.println("This is a football");
        } else if (diameter == 10) {
            System.out.println("This is a tennis ball");
        } else {
            System.out.println("This is a ping pong ball");
        }

    }
}
