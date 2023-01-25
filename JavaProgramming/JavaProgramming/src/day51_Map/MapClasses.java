package day51_Map;

import java.util.*;

public class MapClasses {
    public static void main(String[] args) {
//                key      value
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(10, "Arthur");
        hashMap.put(20, "George");
        hashMap.put(3, "Jack");
        hashMap.put(40, "Emma");
        hashMap.put(5, "Isabella"); // Isabella goes to garbage :)
        hashMap.put(5, "Ahmet"); // if you duplicate key, it provides the last assigned value

        System.out.println("=================== HASH MAP ===================");
        System.out.println("Hash Map = " + hashMap);

        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(10, "Arthur");
        linkedHashMap.put(20, "George");
        linkedHashMap.put(3, "Jack");
        linkedHashMap.put(40, "Emma");
        linkedHashMap.put(5, "Ahmet");
        linkedHashMap.put(5, "Isabella");
        linkedHashMap.put(null, "Hulya");

        System.out.println("=============== LINKED HASH MAP ===============");
        System.out.println("Linked Hash Map = " + linkedHashMap);

        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(10, "Arthur");
        treeMap.put(20, "George");
        treeMap.put(3, "Jack");
        treeMap.put(40, "Emma");
        treeMap.put(5, "Isabella");

        System.out.println("=================== TREE MAP ===================");
        System.out.println("Tree Map = " + treeMap);

        Map<Integer, String> hashtable = new Hashtable<>();
        hashtable.put(10, "Arthur");
        hashtable.put(20, "George");
        hashtable.put(3, "Jack");
        hashtable.put(40, "Emma");
        hashtable.put(5, "Isabella");

        System.out.println("=================== HASHTABLE ===================");
        System.out.println("Hashtable = " + hashtable);

    }
}
