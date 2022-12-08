package day23_CustomMethods_Void;

import org.w3c.dom.ls.LSOutput;

public class CustomMethodsWithParametres {
    public static void main(String[] args) {
    oddOrEvenNumber(5);
    oddOrEvenNumber(8);
    ageOfPerson(1985);
    printNumbers(10,50);

    }
    public static void oddOrEvenNumber (int number) {

        if( number % 2 == 0 ) {
            System.out.println(number + " is Even Number");
        } else {
            System.out.println(number + " is Odd Number");
        }

    }

    public static void ageOfPerson(int birthYear) {
        int age = 2022 - birthYear;
        System.out.println("Your age is " + age);
    }

    public static void printNumbers ( int x, int y) {
        for (int i = x; i <=y ; i++) {
            System.out.print(i + " ");
        }
    }

}
