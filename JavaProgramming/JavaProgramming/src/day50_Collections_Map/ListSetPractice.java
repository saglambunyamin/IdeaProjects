package day50_Collections_Map;

import java.sql.Array;
import java.util.*;

public class ListSetPractice {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        set.addAll(Arrays.asList(1,2,3,4,5,1,2,3,4,5));
        System.out.println("Set Size = " + set.size());
        System.out.println("Set = " + set);

        // Integer [] array = set.toArray(new Integer[0]);
        List<Integer> list = new ArrayList<>(  set  );
        System.out.println("List = " + list);

        List<String> names= null;

    }
}
