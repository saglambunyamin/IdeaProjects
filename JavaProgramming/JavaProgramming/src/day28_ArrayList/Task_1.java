package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Task_1 {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,3,4,5));
        numbers.set(4,0);
        System.out.println("numbers = " + numbers);

    }
}
