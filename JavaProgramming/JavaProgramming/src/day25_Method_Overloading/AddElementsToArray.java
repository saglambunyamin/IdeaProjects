package day25_Method_Overloading;

import java.util.Arrays;

public class AddElementsToArray {
    public static void main(String[] args) {

        int [] arr = {1,2,3,4};
        arr = addInteger(arr, 5);
        System.out.println(Arrays.toString(arr));
        System.out.println("----------------------------------");

        double [] arr2 = {1.5, 2.5, 3.5, 4.5};
        arr2 = addDouble(arr2, 5.5);
        System.out.println(Arrays.toString(arr2));
        System.out.println("----------------------------------");

        char [] arr3 = {'a', 'b', 'c', 'd'};
        arr3 = addChar(arr3,'e');
        System.out.println(Arrays.toString(arr3));
        System.out.println("----------------------------------");

        String [] arr4 = {"Numan", "Orhan", "Nimet"};
        arr4 = addString(arr4, "Benjamin");
        arr4 = addString(arr4, "Benji");
        System.out.println(Arrays.toString(arr4));

    }

    public static int[] addInteger (int[] array, int element) {
        int [] result = new int [array.length+1];
        int i = 0;
        for ( int each : array ) {
            result [i++] = each;
        }
        result [i] = element;
        return result;
    }

    public static double [] addDouble (double[] array, double element) {
        double [] result = new double [array.length+1];
        int i = 0;
        for ( double each : array ) {
            result [i++] = each;
        }
        result [i] = element;
        return result;
    }

    public static char [] addChar (char[] array,  char element) {
        char [] result = new char[array.length+1];
        int i = 0;
        for ( char each : array ) {
            result [i++] = each;
        }
        result [i] = element;
        return result;
    }

    public static String [] addString (String[] array,  String element) {
        String [] result = new String[array.length+1];
        int i = 0;
        for ( String each : array ) {
            result [i++] = each;
        }
        result [i] = element;
        return result;
    }

}
