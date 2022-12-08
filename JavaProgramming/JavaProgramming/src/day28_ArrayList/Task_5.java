package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Task_5 {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(79,94,32,47,53));

        int max = numbers.get(0);

        for (Integer a : numbers) {
            if (a > max) {
                max = a;
            }
        }
        System.out.println("max = " + max);
    }
}
