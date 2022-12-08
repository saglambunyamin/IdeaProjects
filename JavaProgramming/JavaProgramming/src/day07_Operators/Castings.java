package day07_Operators;

public class Castings {

    public static void main(String[] args) {

        float averageScore = 20.5F;

        byte num1 = (byte) averageScore; //explicit casting, result=20
        short num2 = (short) averageScore; //explicit casting, result=20
        int num3 = (int) averageScore; //explicit casting, result=20
        float num4 = averageScore; // there is no casting
        double num5 = averageScore; //implicit casting, result=20.5
        long num6 = (long) averageScore; //explicit casting, result=20


        /* explicit casting: casting larger type to smaller
           implicit casting: casting smaller type to larger
           double > float > long > int > short > byte
         */


        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);
        System.out.println("num5 = " + num5);
        System.out.println("num6 = " + num6);


    }
}
