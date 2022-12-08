package Zulfikar_11_30_2022;

import java.util.Arrays;

public class ArraysTask2 {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int reverse [] = new int[arr.length];
        for (int i = arr.length-1, j=0; i >= 0; i--, j++) {
            reverse[j] = arr[i];
        }
        System.out.println(Arrays.toString(reverse));
    }
}
