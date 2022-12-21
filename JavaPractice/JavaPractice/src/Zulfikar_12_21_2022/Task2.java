package Zulfikar_12_21_2022;

public class Task2 {
    public static void main(String[] args) {

        String str = "123house259";
        String temp = "";
        int sumOfNumbers = 0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                temp += str.charAt(i);
            }
        }
        System.out.println("temp = " + temp);
        for (int i = 0; i < temp.length(); i++) {
            if (Integer.valueOf("" + temp.charAt(i)) % 3 == 0) {
                sumOfNumbers += Integer.valueOf("" + temp.charAt(i));
            }
        }
        System.out.println("sumOfNumbers = " + sumOfNumbers);
    }
}

/*
 2. Write a java program, find sum of the numbers in a string,
    only if the number is divisible by 3
 */