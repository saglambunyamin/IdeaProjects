package day22_MultiDimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArraysIntro {
    public static void main(String[] args) {

        String [] group1 = {"Jon", "Joes", "James"};
        String [] group2 = {"Aaron", "Shay", "Breanna"};
        String [] group3 = {"Cassandra", "Tahir", "Aygun"};

        String [] [] groups = new String[3][];
        groups [0] = group1;
        groups [1] = group2;
        groups [2] = group3;

        System.out.println(Arrays.deepToString(groups));
        System.out.println("==================================================");

        int [] [] arr2D = { {1,2,3} , {4,5,6,7} , {8,9,10,11,12} };
        System.out.println ( Arrays.toString ( arr2D[0] ) );
        System.out.println( arr2D[2] [3] );

    }
}
