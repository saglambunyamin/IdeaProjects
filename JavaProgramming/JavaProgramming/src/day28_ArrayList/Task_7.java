package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Task_7 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
       list.addAll(Arrays.asList(1,2,2,3,4,4,5,6,7,7));
 String result = "";

        for (Integer number : list) {
            int f = 0;
            for (Integer integer : list) {
                if (number == integer) {
                    f++;
                }
            }
            if (f == 2) {
                result += number;
                }
        }
        System.out.println(result.charAt(0));

    }
}
