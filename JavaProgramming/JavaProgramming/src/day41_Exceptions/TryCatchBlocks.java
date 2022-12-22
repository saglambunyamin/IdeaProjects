package day41_Exceptions;

public class TryCatchBlocks {
    public static void main(String[] args) {

        System.out.println("Test Started");
        try {
            System.out.println(9/0);
            System.out.println("Try Block");
        } catch (ArithmeticException e) {
            System.out.println("Catch Block");
            System.out.println("Arithmetic Exception was occured");
        }
        System.out.println("Test Completed");
        System.out.println("==================================================");

        int [] numbers = {1,2,3,4,5};
        try {
            System.out.println(numbers[200]);
            System.out.println("Try Block");
        } catch (RuntimeException e) {
            //e.printStackTrace(); // gives the all details aout the exception
            System.out.println(e.getMessage());
        }
        System.out.println("Test2 Completed");
        System.out.println("==================================================");

        System.out.println("Test3 Started");
        try {
            System.out.println("Cydeo".substring(2, 0));
        } catch (RuntimeException e) {
            e.printStackTrace();
            System.out.println("The Exception is: " + e.getMessage());
        }
        System.out.println("Test3 Completed");
        System.out.println("==================================================");

        System.out.println("Hello");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Cydeo");
        System.out.println("==================================================");

    }
}
