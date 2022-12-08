package day28_ArrayList;

import java.util.ArrayList;

public class Task_4 {
    public static void main(String[] args) {

        String arr1 [] = {"A", "B", "C"};
        String arr2 [] = {"D", "E", "F", "G"};

        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < arr1.length; i++) {
            result.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            result.add(arr2[i]);
        }
        System.out.println("result = " + result);
    }
}
