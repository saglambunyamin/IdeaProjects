package week09_11_05_2022;

public class MultidimensionalArraysIntro {
    public static void main(String[] args) {

        int [] firstArray = {1,2,3};
        int [] secondArray = {4,5,6};
        int [] thirdArray = {7,8,9};

        int [] [] twoDimenArray = {
                {1,2,3},
                {4,5,6},
                {7,8,9,10}
        };

        int [] [] array2D = {firstArray, secondArray, thirdArray};

        System.out.println(twoDimenArray[0] [1]);
        System.out.println(twoDimenArray[2] [2]);

        for (int[] array1D : array2D){
            for (int each : array1D){
                System.out.print(each + " ");
            }
        }
    }
}
