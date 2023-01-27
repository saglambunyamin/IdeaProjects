package day52_Map_FunctionalInterface;

public class Test {
    public static void main(String[] args) {

        // function1: create a function that can display a number is odd or even
        MyFirstFunctionalInterface oddOrEvenNumber = (n) -> {
            if (n%2==0) {
                System.out.println(n + " is EVEN number");
            } else {
                System.out.println(n + " is ODD number");
            }
        };
        oddOrEvenNumber.apply(20);
        System.out.println("==================================================");

        // function2: create a function that can check if a person is eligible to buy alcohol
        MyFirstFunctionalInterface eligibleToBuyAlcohol = (age) -> {
           if (age >= 21) {
               System.out.println("Age " + age + " is Eligible to buy alcohol");
           } else {
               System.out.println("Age " + age + " is NOT Eligible to buy alcohol");
           }
        };
        eligibleToBuyAlcohol.apply(18);
        System.out.println("==================================================");

        //function3: create a function that can display the cube of a number
        MyFirstFunctionalInterface printCube = (n) -> {
            System.out.println(n*n*n);
        };
        printCube.apply(3);

        System.out.println("==================================================");

        //function4: create a function that can check if a number is evenly divisble by  3 & 5
        MyFirstFunctionalInterface divisibleBy3And5 = (n) -> {
           if (n%15==0) {
               System.out.println(n + " is divisible 3 and 5");
           } else {
               System.out.println(n + " is NOT divisible 3 and 5");
           }
        };
        divisibleBy3And5.apply(157);
    }
}
