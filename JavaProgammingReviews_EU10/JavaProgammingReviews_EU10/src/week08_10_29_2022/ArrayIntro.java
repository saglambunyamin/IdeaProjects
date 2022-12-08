package week08_10_29_2022;

import java.util.Arrays;

public class ArrayIntro {
    public static void main(String[] args) {
        // if we know the elements of the array
        int [] arrayName = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(arrayName));

        // if we don't know the elements of the array
        // we have to define the size of the elements
        int [] array = new int[10];
        array [0] = 10;
        array [1] = 20;
        array [2] = 30;
        array [3] = 40;
        array [4] = 50;
        array [5] = 60;
        array [6] = 70;
        array [7] = 80;
        array [8] = 90;
        array [9] = 100;

        System.out.println(Arrays.toString(array));
        System.out.println("=============================================");

        char[] letters = {'B', 'S', 'D', 'Y'};
        System.out.println("Letters: " + Arrays.toString(letters));
        System.out.println("=============================================");

        //SORT METHOD
        int [] numbers = {8,6,2,5,14,3};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println("=============================================");

        int[] arr1 = {1,2,3};
        int[] arr2 = {2,1,3};
        System.out.println("Arrays are equal? " + Arrays.equals(arr1,arr2));
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println("Arrays are equal? " + Arrays.equals(arr1,arr2));
        System.out.println("=============================================");



    }
}
