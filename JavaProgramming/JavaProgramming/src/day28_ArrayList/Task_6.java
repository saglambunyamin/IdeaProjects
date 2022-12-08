package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Task_6 {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(79,94,32,47,53));

        int min = numbers.get(0);

        for (Integer a : numbers) {
            if (a < min) {
                min = a;
            }
        }
        System.out.println("min = " + min);

    }
}
