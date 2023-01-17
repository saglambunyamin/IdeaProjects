package day49_Collections;

import java.lang.reflect.Array;
import java.util.*;

public class SetInterfacePractice {
    public static void main(String[] args) {

        System.out.println("====================HASHSET====================");
        Set<Integer> hashSet = new HashSet<>();
        hashSet.addAll(Arrays.asList(10,200,300,40,90));
        System.out.println(hashSet);

        hashSet.addAll(Arrays.asList(10,200,300,40,90));
        hashSet.addAll(Arrays.asList(10,200,300,40,90));
        System.out.println(hashSet);

        System.out.println("================LINKEDHASHSET================");
        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.addAll(Arrays.asList(10,200,300,40,90, null));
        System.out.println(linkedHashSet);

        System.out.println("====================TREESET====================");
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.addAll(Arrays.asList(10,200,300,40,90));
        System.out.println(treeSet);


    }
}
