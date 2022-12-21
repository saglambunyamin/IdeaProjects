package Zulfikar_12_21_2022;

import java.util.ArrayList;
import java.util.Collections;

public class Task5 {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(12);
        numbers.add(23);
        numbers.add(41);
        numbers.add(58);
        numbers.add(37);
        numbers.add(18);
        numbers.add(29);
        numbers.add(45);
        numbers.add(53);
        Collections.sort(numbers);
        System.out.println("numbers = " + numbers);

    }
}