package week11_11_19_2022;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeArrays {
    public static void main(String[] args) {

        ArrayList<Integer> arr1 = new ArrayList<>();
        arr1.addAll(Arrays.asList(1,2,3));

        ArrayList<Integer> arr2 = new ArrayList<>();
        arr2.addAll(Arrays.asList(4,5,6));

        int [] result = mergedArray(arr1, arr2);
        System.out.println(Arrays.toString(result));
    }

    public static int [] mergedArray (ArrayList<Integer> arr1, ArrayList<Integer> arr2) {

        int [] result = new int [arr1.size() + arr2.size()];
        int index = 0;

        for (Integer each : arr1) {
            result [index++] = each;
        }
        for (Integer each : arr2) {
            result [index++] = each;
        }
        return result;
    }
}
