package week11_11_19_2022;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeUniqueElements {
    public static void main(String[] args) {

        int [] firstArray = {1, 2, 3, 3, 4, 5};
        int [] secondArray = {4, 5, 6, 6, 6 , 7, 7};

        ArrayList<Integer> result = uniqueElements(firstArray, secondArray);
        System.out.println("result = " + result);

    }

    public static ArrayList<Integer> uniqueElements (int [] firstArray, int [] secondArray) {

        ArrayList<Integer> array = new ArrayList<>();

        for (int number : firstArray) {
            if (! array.contains(number)) {
                array.add(number);
            }
        }
        for (int number : secondArray) {
            if (! array.contains(number)) {
                array.add(number);
            }
        }
        return array;
    }

}
