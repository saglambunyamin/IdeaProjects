package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtility {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(8,9,6,7,10,5,1,3,2,4));

        Collections.sort(list);
        System.out.println(list);
        System.out.println("------------------------------------------------------------");

        ArrayList<Character> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList('a', 'b', 'c', 'd', 'e'));

        Collections.reverse(list2);
        System.out.println(list2);
        System.out.println("-----------------------------------------------------------");

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList(10,20,30,40,50,60,70));

        Collections.swap(list3, 1,4); // changing the indexes of given objects
        System.out.println(list3);
        System.out.println("--------------------------------------------------------");

        int max = Collections.max(list3);
        int min = Collections.min(list3);

        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("--------------------------------------------------------");

        ArrayList<Integer> list4 = new ArrayList<>();
        list4.addAll(Arrays.asList(10,10, 20,30,40,50,10,10, 10));
        Collections.replaceAll(list4, 10, 1000);
        System.out.println(list4);
        System.out.println("--------------------------------------------------------");

        int frequency = Collections.frequency(list4, 1000);
        System.out.println("frequency = " + frequency);
        System.out.println("--------------------------------------------------------");

        ArrayList<String> words = new ArrayList<>();
        words.addAll(Arrays.asList("Java", "Java", "Python", "Python", "Ruby", "C#"));

        int countJava = Collections.frequency(words, "Java");
        int countPython = Collections.frequency(words, "Python");

        boolean r = countJava == countPython;
        System.out.println("r = " + r);




    }
}
