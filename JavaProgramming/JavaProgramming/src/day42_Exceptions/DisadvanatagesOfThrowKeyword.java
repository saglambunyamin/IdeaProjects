package day42_Exceptions;

public class DisadvanatagesOfThrowKeyword {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Hello");
        Thread.sleep(3000); // throw
        System.out.println("Hello World");
        System.out.println("------------------------------");

        System.out.println("Hello");
        MorningWorkOut.sleep(2.5);  //try & catch
        System.out.println("Cydeo");

    }
}
