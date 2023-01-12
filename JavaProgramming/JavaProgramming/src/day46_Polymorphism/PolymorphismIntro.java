package day46_Polymorphism;

import day39_Recap.ShapeTask.Circle;
import day39_Recap.ShapeTask.Square;

public class PolymorphismIntro {
    public static void main(String[] args) {

        String str = "Wooden Spoon";
        Integer n1 = 2;
        Double n2 = 5.5;
        Boolean r1 = true;

         Object [] array = {str, n1, n2, r1, new Circle(7.5), new Square(8.4)};



    }
}
