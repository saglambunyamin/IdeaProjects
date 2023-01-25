package day51_Map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapMethods {
    public static void main(String[] args) {

        Map<String, Integer>students = new HashMap<>();
        students.put("Aygun", 95);
        students.put("Maria", 95);
        students.put("Ali", 95);
        students.put("Alex", 96);
        students.put("Ozan", 98);
        students.put("Serkan", 97);
        students.put("Andriy", 98);

        students.put("Ali", 85);
        students.put("Ali", 86);
        students.put("Ali", 87);

        System.out.println("students = " + students);
        System.out.println("students.size() = " + students.size());

        System.out.println("students.get(\"Alex\") = " + students.get("Alex"));

        students.replace("Ali",90);
        System.out.println("students = " + students);

        students.remove("Alex");
        System.out.println("students = " + students);

        System.out.println("students.containsKey(\"Ali\") = " + students.containsKey("Ali"));
        System.out.println("students.containsKey(\"Alex\") = " + students.containsKey("Alex"));

        System.out.println("students.containsValue(90) = " + students.containsValue(90));
        System.out.println("students.containsValue(80) = " + students.containsValue(80));

        System.out.println("students.isEmpty() = " + students.isEmpty());

        Map<String, Integer> map1 = new HashMap<>();
        map1.putAll(students);

        Map<String, Integer> map2 = new HashMap<>();
        map2.putAll(students);

        System.out.println("(map1 == map2) = " + (map1 == map2));
        System.out.println("map1.equals(map2) = " + map1.equals(map2));

        map1.clear();
        map2.clear();

        System.out.println("map1 = " + map1);
        System.out.println("map2 = " + map2);

    }
}
