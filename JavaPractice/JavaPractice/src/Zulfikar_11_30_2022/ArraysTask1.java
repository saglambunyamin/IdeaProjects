package Zulfikar_11_30_2022;

public class ArraysTask1 {
    public static void main(String[] args) {

        int [] numbers = {1,2,3,4,5,6,7,8,9,10};
        int sumOfOdd = 0;
        int sumOfEven = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] %2 == 0) {
                sumOfEven += numbers[i];
            } else {
                sumOfOdd += numbers[i];
            }
        }
        System.out.println(sumOfEven);
        System.out.println(sumOfOdd);
    }
}
