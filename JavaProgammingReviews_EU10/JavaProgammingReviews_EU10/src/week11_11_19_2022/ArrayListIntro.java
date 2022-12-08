package week11_11_19_2022;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListIntro {
    public static void main(String[] args) {
        // how to create an ArrayList
        ArrayList<String> cities = new ArrayList<>();

        // how to add element to ArrayList
        cities.add("London"); //returns boolean
        cities.add("Paris");
        cities.add("Istanbul");
        cities.add("Rome");
        System.out.println(cities);
        System.out.println("-------------------------------------------------------------");

        cities.add(0, "Vienna");
        System.out.println(cities);

        System.out.println("-------------------------------------------------------------");
        System.out.println(cities.get(0));

        cities.set(2, "New York");
        System.out.println("===============After Update===============");
        System.out.println(cities);
        System.out.println("-------------------------------------------------------------");

        System.out.println("The index of New York is: " + cities.indexOf("New York"));
        System.out.println("-------------------------------------------------------------");

        System.out.println("The index of Paris is: " + cities.indexOf("Paris")); // -1
        System.out.println("-------------------------------------------------------------");

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(1);
        numbers.add(1);
        System.out.println(numbers);

        System.out.println("numbers.indexOf(1) = " + numbers.indexOf(1));
        System.out.println("numbers.lastIndexOf(1) = " + numbers.lastIndexOf(1));
        System.out.println("-------------------------------------------------------------");

        ArrayList<Integer> n = new ArrayList<>();
        n.add(2);
        n.add(3);
        n.add(4);
        n.add(5);
        n.add(1);
        System.out.println(n);

        // how to we remove element
        n.remove(1);
        System.out.println("===================After Remove=================");
        System.out.println("n = " + n);

        System.out.println("===================After Remove=================");
        n.remove(new Integer(4));
        System.out.println("n = " + n);
        System.out.println("-------------------------------------------------------------");

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Mesut", "Osman", "Seyma" ));
        System.out.println("names = " + names);

        // removeAll


        // retainAll


        // removeIf
        ArrayList<Integer> ns = new ArrayList<>();
        ns.addAll(Arrays.asList(1, 1, 1, 2, 3, 4, 5, 1, 1));
        System.out.println("ns = " + ns);
        ns.removeIf( p -> p < 3);
        System.out.println("================ After Remove ===================");
        System.out.println("ns = " + ns);




    }
}
