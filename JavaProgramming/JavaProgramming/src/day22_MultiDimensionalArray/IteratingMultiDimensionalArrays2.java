package day22_MultiDimensionalArray;

public class IteratingMultiDimensionalArrays2 {
    public static void main(String[] args) {

        int [] [] arr2D = { {1,2,3} , {4,5,6,7} , {8,9,10,11,12} };

        for (int i = arr2D.length-1; i >= 0; i--) {

            for (int j = 0; j < arr2D[i].length; j++) {

                System.out.print(  arr2D [i] [j] + " "  );
            }
                System.out.println();
        }
        System.out.println("==================================================");

        for (int i = 0; i < arr2D.length; i++) {

            for (int j = arr2D[i].length-1; j >= 0; j--) {

                System.out.print(  arr2D[i] [j] + " " );
            }
            System.out.println();
        }

        System.out.println("==================================================");

        for (int a = arr2D.length-1; a >= 0; a--) {

            for (int b = arr2D[a].length-1; b >= 0 ; b--) {

                System.out.print(  arr2D [a] [b] + " "  );
            }
            System.out.println();
        }
    }
}
