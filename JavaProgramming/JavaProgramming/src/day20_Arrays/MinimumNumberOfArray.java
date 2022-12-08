package day20_Arrays;

public class MinimumNumberOfArray {
    public static void main(String[] args) {

        int [] numbers = {10, 5, 8, 20, 1, 0};
        int min = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if(min > numbers[i]) {
                min = numbers[i];
            }
        }
        System.out.println("Minimum Number = " + min);
    }
}
