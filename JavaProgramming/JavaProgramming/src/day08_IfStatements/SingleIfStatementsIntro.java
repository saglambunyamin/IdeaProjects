package day08_IfStatements;

public class SingleIfStatementsIntro {

    public static void main(String[] args) {

        int a = 301;

        boolean evenNumber = a%2 == 0;
        boolean oddNumber = a%2 != 0;

        if(evenNumber) {
            System.out.println(a+" is even number.");
        }
        if(oddNumber){
            System.out.println(a+" is odd number.");
        }

        System.out.println("----------------------------");

        int n =-200;

        if(n>0){
            System.out.println(n+" is positive");
        }
        if(n<0) {
            System.out.println(n+" is negative");
        }
        if(n==0) {
            System.out.println(n+" is zero");
        }


    }
}
