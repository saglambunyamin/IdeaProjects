package week16_12_24_2022.Exceptions;

import week12_11_26_2022.employee.Employee;

public class RunTimeExceptions {
    Employee e1;
    public static void main(String[] args) {


        //AritmethicException

        try {
            for (int i = 5; i >=0 ; i--) {
                System.out.println(60/i);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        // Exception in thread "main" java.lang.ArithmeticException: / by zero
        // Ctrl + Alt + T --> try / catch


        // NullPointerException
        // we can not reach instance variables or methods fom the static block or method
        // System.out.println(e1.salary());

        /*
        // NumberFormatException
        String str = "Adam 123.";
        String s = str.substring(str.indexOf(" ") + 1);
        System.out.println(Integer.parseInt(s));
        // Exception in thread "main" java.lang.NumberFormatException: For input string: "123."
        */

        /*
        // ArrayIndexOutOfException
        int [] arr = {1,2,3};
        System.out.println(arr[3]);
        // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException:
        // Index 3 out of bounds for length
        */
    }
}
