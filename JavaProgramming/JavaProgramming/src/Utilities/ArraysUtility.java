package Utilities;

import java.util.Arrays;

public class ArraysUtility {

    public static int[] addElement (int[] array, int element) {
        int [] result = new int [array.length+1];
        int i = 0;
        for ( int each : array ) {
            result [i++] = each;
        }
        result [i] = element;
        return result;
    }

    public static double [] addElement (double[] array, double element) {
        double [] result = new double [array.length+1];
        int i = 0;
        for ( double each : array ) {
            result [i++] = each;
        }
        result [i] = element;
        return result;
    }

    public static char [] addElement (char[] array,  char element) {
        char [] result = new char[array.length+1];
        int i = 0;
        for ( char each : array ) {
            result [i++] = each;
        }
        result [i] = element;
        return result;
    }

    public static String [] addElement (String[] array,  String element) {
        String [] result = new String[array.length+1];
        int i = 0;
        for ( String each : array ) {
            result [i++] = each;
        }
        result [i] = element;
        return result;
    }
    public static void printEachElement (int [] array) {
        for (int each : array) {
            System.out.println(each);
        }
    }

    public static void printEachElement (double [] array) {
        for (double each : array) {
            System.out.println(each);
        }
    }

    public static void printEachElement (String [] array) {
        for (String each : array) {
            System.out.println(each);
        }
    }

    public static void printEachElement (char [] array) {
        for (char each : array) {
            System.out.println(each);
        }
    }

    public static int maximumNumber (int [] numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length-1];
    }

    public static double maximumNumber (double [] numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length-1];
    }

    public static int minimumNumber (int [] numbers) {
        Arrays.sort(numbers);
        return numbers[0];
    }

    public static double minimumNumber (double [] numbers) {
        Arrays.sort(numbers);
        return numbers[0];
    }

    public static boolean contains (int[] array, int element) {
        boolean result = false;
    for (int each : array) {
        if ( each == element ) {
            result = true;
        }
    }
        return result;
    }

    public static boolean contains (double [] array, double element) {
        boolean result = false;
        for (double each : array) {
            if ( each == element ) {
                result = true;
            }
        }
        return result;
    }

    public static boolean contains (char[] array, char element) {
        boolean result = false;
        for (char each : array) {
            if ( each == element ) {
                result = true;
            }
        }
        return result;
    }

    public static boolean contains (String [] array, String element) {
        boolean result = false;
        for (String each : array) {
            if ( each == element ) {
                result = true;
            }
        }
        return result;
    }

    public static int frequencyOfElement (int [] array, int element) {
        int count = 0;
        for (int each : array) {
            if(each==element) {
                count++;
            }
        }
        return count;
    }

    public static int frequencyOfElement (double [] array, double element) {
        int count = 0;
        for (double each : array) {
            if(each==element) {
                count++;
            }
        }
        return count;
    }

    public static int frequencyOfElement (char [] array, char element) {
        int count = 0;
        for (char each : array) {
            if(each==element) {
                count++;
            }
        }
        return count;
    }

    public static int frequencyOfElement (String [] array, String element) {
        int count = 0;
        for (String each : array) {
            if(each.equals(element)) {
                count++;
            }
        }
        return count;
    }

    public static int [] uniqueElements ( int [] array ) {
        int [] result = {};
        for (int each : array) {
            if ( ArraysUtility.frequencyOfElement(array, each) == 1 ) {
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }

    public static double [] uniqueElements ( double [] array ) {
        double [] result = {};
        for (double each : array) {
            if ( ArraysUtility.frequencyOfElement (array, each) == 1 ) {
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }

    public static char [] uniqueElements ( char [] array ) {
        char [] result = {};
        for (char each : array) {
            if ( ArraysUtility.frequencyOfElement (array, each) == 1 ) {
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }

    public static String [] uniqueElements ( String [] array ) {
        String [] result = {};
        for (String each : array) {
            if ( ArraysUtility.frequencyOfElement (array, each) == 1 ) {
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }

    public static int [] removeElement (int [] array, int index) {
        if(index < 0 || index >= array.length) {
            System.out.println("Invalid index " + index);
            System.exit(0);
        }

        int [] result = {};
        for (int i = 0; i < array.length; i++) {
            if (i != index) {
                result = ArraysUtility.addElement(result, array[i]);
            }
        }
        return result;
    }

    public static double [] removeElement (double [] array, int index) {
        if(index < 0 || index >= array.length) {
            System.out.println("Invalid index " + index);
            System.exit(0);
        }

        double [] result = {};
        for (int i = 0; i < array.length; i++) {
            if (i != index) {
                result = ArraysUtility.addElement(result, array[i]);
            }
        }
        return result;
    }

    public static char [] removeElement (char [] array, int index) {
        if(index < 0 || index >= array.length) {
            System.out.println("Invalid index " + index);
            System.exit(0);
        }

        char [] result = {};
        for (int i = 0; i < array.length; i++) {
            if (i != index) {
                result = ArraysUtility.addElement(result, array[i]);
            }
        }
        return result;
    }

    public static String [] removeElement (String [] array, int index) {
        if(index < 0 || index >= array.length) {
            System.out.println("Invalid index " + index);
            System.exit(0);
        }

        String [] result = {};
        for (int i = 0; i < array.length; i++) {
            if (i != index) {
                result = ArraysUtility.addElement(result, array[i]);
            }
        }
        return result;
    }

    public static int [] merge (int[] array1, int[] array2) {
        int [] result = {};
        for (int each : array1) {
            result = addElement(result, each);
        }
        for (int each : array2) {
            result = addElement(result, each);
        }
        return result;

    }

    public static double [] merge (double [] array1, double [] array2) {
        double [] result = {};
        for (double each : array1) {
            result = addElement(result, each);
        }
        for (double each : array2) {
            result = addElement(result, each);
        }
        return result;

    }

    public static char [] merge (char[] array1, char[] array2) {
        char [] result = {};
        for (char each : array1) {
            result = addElement(result, each);
        }
        for (char each : array2) {
            result = addElement(result, each);
        }
        return result;

    }

    public static String [] merge (String[] array1, String[] array2) {
        String [] result = {};
        for (String each : array1) {
            result = addElement(result, each);
        }
        for (String each : array2) {
            result = addElement(result, each);
        }
        return result;

    }

    public static int [] reverse (int [] array) {
        int [] result = new int[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            result [j] = array [i];
        }
        return result;
    }

    public static double [] reverse (double [] array) {
        double [] result = new double [array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            result [j] = array [i];
        }
        return result;
    }

    public static char [] reverse (char [] array) {
        char [] result = new char [array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            result [j] = array [i];
        }
        return result;
    }

    public static String [] reverse (String [] array) {
        String [] result = new String [array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            result [j] = array [i];
        }
        return result;
    }

    public static int [] replace (int [] array, int index, int newElement) {
        if (index < 0 || index > array.length) {
            System.out.println("Invalid index");
            System.exit(0);
        }
         array [index] = newElement;
        return array;
    }

    public static double [] replace (double [] array, int index, double newElement) {
        if (index < 0 || index > array.length) {
            System.out.println("Invalid index");
            System.exit(0);
        }
        array [index] = newElement;
        return array;
    }

    public static char [] replace (char [] array, int index, char newElement) {
        if (index < 0 || index > array.length) {
            System.out.println("Invalid index");
            System.exit(0);
        }
        array [index] = newElement;
        return array;
    }

    public static String [] replace (String [] array, int index, String newElement) {
        if (index < 0 || index > array.length) {
            System.out.println("Invalid index");
            System.exit(0);
        }
        array [index] = newElement;
        return array;
    }

    public static int [] replaceAll ( int [] array, int oldValue, int newValue) {
        for (int i = 0; i < array.length; i++) {
            if (array [i] == oldValue) {
                array [i] = newValue;
            }
        }
        return array;
    }

    public static double [] replaceAll ( double [] array, double oldValue, double newValue) {
        for (int i = 0; i < array.length; i++) {
            if (array [i] == oldValue) {
                array [i] = newValue;
            }
        }
        return array;
    }

    public static char [] replaceAll ( char [] array, char oldValue, char newValue) {
        for (int i = 0; i < array.length; i++) {
            if (array [i] == oldValue) {
                array [i] = newValue;
            }
        }
        return array;
    }

    public static String [] replaceAll ( String [] array, String oldValue, String newValue) {
        for (int i = 0; i < array.length; i++) {
            if (array [i] == oldValue) {
                array [i] = newValue;
            }
        }
        return array;
    }

    public static int [] removeDuplicates ( int [] array) {
        int [] result = {};
        for (int each : array) {
            if (!ArraysUtility.contains(result, each)) {
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }

    public static double [] removeDuplicates ( double [] array) {
        double [] result = {};
        for (double each : array) {
            if (!ArraysUtility.contains(result, each)) {
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }

    public static char [] removeDuplicates ( char [] array) {
        char [] result = {};
        for (char each : array) {
            if (!ArraysUtility.contains(result, each)) {
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }

    public static String [] removeDuplicates ( String [] array) {
        String [] result = {};
        for (String each : array) {
            if (!ArraysUtility.contains(result, each)) {
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }

}
