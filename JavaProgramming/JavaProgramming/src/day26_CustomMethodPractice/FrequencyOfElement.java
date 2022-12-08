package day26_CustomMethodPractice;

import Utilities.ArraysUtility;

public class FrequencyOfElement {
    public static void main(String[] args) {

        int [] numbers = {1,1,1,11,1,2,2,3,3,3,4,4,1,1,1,1};
        int n = ArraysUtility.frequencyOfElement(numbers, 1);
        System.out.println(n);
        System.out.println("--------------------------------------");

        String [] students = {"Ayse", "Benjamin", "Numan", "Orhan", "Nimet", "Numan", "Orhan"};
        int s = ArraysUtility.frequencyOfElement(students, "Numan");
        System.out.println(s);
        System.out.println("--------------------------------------");

        char [] chars = {'N', 'B', 'J', 'J', 'K', 'J'};
        int c = ArraysUtility.frequencyOfElement(chars, 'J');
        System.out.println(c);
        System.out.println("-----------------------------------------");

        double [] decimals = {3.14, 3.14, 3.14, 6.9, 9.6, 9.6};
        int d = ArraysUtility.frequencyOfElement(decimals, 3.14);
        System.out.println(d);

    }

}
