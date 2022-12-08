package day09_IsElseStatements;

public class PosNegZero {

    public static void main(String[] args) {

        int n = -23;

        if(n>0) {
            System.out.println("Your number is <Positive>");
        } else if (n<0) {
            System.out.println("Your number is <Negative>");
        } else {
            System.out.println("Your number is <Zero>");
        }
    }
}
