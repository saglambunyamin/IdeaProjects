package day51_Map;

import java.util.*;

public class MapIteration {
    public static void main(String[] args) {

        Map<String, Integer>students = new HashMap<>();
        students.put("Aygun", 95);
        students.put("Maria", 90);
        students.put("Ali", 85);
        students.put("Alex", 80);
        students.put("Ozan", 75);
        students.put("Serkan", 70);
        students.put("Andriy", 98);

        /*
        Set<String> keys = students.keySet();
        for (String eachKey : keys) {
            //System.out.println(eachKey + " : " + students.get(eachKey));
            students.replace(eachKey, students.get(eachKey) + 5);
        }
        */

        Map<String, Integer> earlyBirds = new HashMap<>();
        Map<String, Integer> angryBirds = new HashMap<>();

        for (String key : students.keySet()) {
            Integer value = students.get(key);
            if (value >= 90 ) {
                earlyBirds.put(key,value);
            } else {
                angryBirds.put(key, value);
            }
        }

        System.out.println("earlyBirds = " + earlyBirds);
        System.out.println("angryBirds = " + angryBirds);
        System.out.println("===========================================================");

        List<Integer> scores = new ArrayList<>( students.values() );
        System.out.println("scores = " + scores);

        System.out.println("max score = " + Collections.max(scores));
        System.out.println("min score = " + Collections.min(scores));

        System.out.println("max score = " + Collections.max(students.values()));
        System.out.println("min score = " + Collections.min(students.values()));
        System.out.println("===========================================================");

        for (Map.Entry<String, Integer> entry : students.entrySet()) {
            //System.out.println(entry);
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

    }
}
