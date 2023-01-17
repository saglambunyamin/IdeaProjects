package day49_Collections;

import java.util.*;

public class SetInterfacePractice2 {
    public static void main(String[] args) {

        String [] arr = {"Wooden Spoon", "Book", "Pen", "Phone", "Wooden Spoon", "Wooden Spoon", "Wooden Spoon", "Wooden Spoon", "Milk", "Eggs", "Coke", "Paper towels"};

        arr = new LinkedHashSet<>(  Arrays.asList(  arr  )).toArray(  new String [0]  );
        /*
        Set<String> set1 = new HashSet<>(Arrays.asList(arr));
        arr = set1.toArray(  new String [0]  );

        System.out.println("set1 = " + set1);
         */
        System.out.println("arr = " + Arrays.toString(arr));
        System.out.println("==================================================");

        ArrayList<Integer>list  = new ArrayList<>();
        list.addAll(Arrays.asList(1000,300,1000,200,300,400,500,500,600,10,10,20,30,40,30,20,10));

        list = new ArrayList<> (new LinkedHashSet<>(list));
        System.out.println("list = " + list);
        System.out.println("==================================================");

        String [] array = {"A", "A", "B", "C"};
        Set<String> s = new LinkedHashSet<>();
        s.addAll(Arrays.asList(array));
        s.addAll(Arrays.asList("E", "F", "G"));
        System.out.println("s = " + s);
        System.out.println("==================================================");

        Integer[] nums = {1,2,1,1,2,2,3,3,3,2,3,4,5,1,2,3,4,5,1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6,7,8,9,10};
        nums = new LinkedHashSet<>(  Arrays.asList(nums) ).toArray( new Integer[0] );
        System.out.println("numbers = " + Arrays.toString(nums) );
        System.out.println("==================================================");

        String str = "eeeeeaaaabbbbccccdddeeeee";
        String result = "";

        for (String each : new LinkedHashSet<>(Arrays.asList(str.split("")))) {
            result += each + Collections.frequency(  Arrays.asList(str.split("")) ,  each);
        }
        System.out.println("Frequency of each characters = " + result);
        System.out.println("==================================================");

        Set<String> names = new LinkedHashSet<>();
        names.addAll(Arrays.asList("Ahmet", "Ahmet", "John", "James", "Breanna", "Shay", "Ahmet"));
        System.out.println( names.toArray(new String[0])[2] );
        System.out.println( new ArrayList<>(names).get(4)  );

        for(String each : names ){
            System.out.println(each);
        }

    }
}
