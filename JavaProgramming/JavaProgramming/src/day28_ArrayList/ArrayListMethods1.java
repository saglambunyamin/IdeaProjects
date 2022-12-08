package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListMethods1 {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        System.out.println(numbers);

        numbers.add(3,70);
        System.out.println(numbers);
        System.out.println("------------------------------------------------------");

        System.out.println(numbers.size());

        int lastIndex = numbers.size();
        System.out.println("lastIndex = " + lastIndex);
        System.out.println("------------------------------------------------------");

        Integer num = numbers.get(3);
        System.out.println("num = " + num);

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }
        System.out.println("------------------------------------------------------");

        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("Java");
        list.add("C#");
        list.add("Ruby");
        System.out.println(list);

        list.set(2, "JavaScript");
        System.out.println(list);

        list.set(3,"C++");
        System.out.println(list);
        System.out.println("------------------------------------------------------");

        ArrayList<String> employees = new ArrayList<>();
        employees.add("Suat");
        employees.add("Aygun");
        employees.add("Olga");
        employees.add("Neira");
        employees.add("Ali");
        employees.add("Hulya");
        employees.add("Kaloyan");
        System.out.println(employees);

        employees.remove(0);
        System.out.println(employees);

        employees.remove("Ali");
        System.out.println(employees);


    }
}
