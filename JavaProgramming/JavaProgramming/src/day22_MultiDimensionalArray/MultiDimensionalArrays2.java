package day22_MultiDimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArrays2 {
    public static void main(String[] args) {

        int [] [] [] arr3D = { { {1,2,3}, {4,5,6} , {7,8,9} } , { {10,20,30} , {40,50,60} , {70,80,90} } };

        System.out.println ( Arrays.deepToString ( arr3D ) );

        System.out.println ( Arrays.deepToString ( arr3D [1] ) ) ;

        System.out.println ( Arrays.toString ( arr3D [1] [1] ) );

        System.out.println ( arr3D [0] [2] [2] );

        System.out.println("==================================================");

        for ( int [] [] each2D : arr3D ) {

            for ( int [] each1D : each2D ) {

                for ( int element : each1D ) {

                    System.out.print(element + " ");

                }

            }

        }

    }
}
