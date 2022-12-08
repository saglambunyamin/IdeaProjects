package day09_IsElseStatements;

public class minNumber {

    public static void main(String[] args) {

        int n1 = 200;
        int n2 = 100;

        if(n1<n2) {
            System.out.println(n1+" is the minimum number.");
            }
        if(n2<n1) {
            System.out.println(n2+" is the minimum number.");
        }
        if (n1 == n2) {
            System.out.println(n1+" and "+n2+" are equal numbers.");
        }

    }
}
