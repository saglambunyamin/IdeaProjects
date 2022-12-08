package day34_GarbageCollection_AccessModifiers;

import day30_CustomClass.Dog;
import day33_Statics.Student;
import java.util.ArrayList;
import java.util.Arrays;

public class GarbageCollection {
    public static void main(String[] args) {

        /*
        String str = null;
        System.out.println(  str.toUpperCase()  );

        String s = "";
        System.out.println(  s.toUpperCase()  );
        */

        String str = "Wooden Spoon"; // after line 15, "Wooden Spoon" will be eligible for garbage collection
        str = null;
        System.out.println(  str  );
        System.out.println("==================================================");

        Dog d1 = new Dog();
        d1.name = "Lucy";

        d1 = new Dog();// after line 26, "Lucy" will be eligible for garbage collection
        d1.name = "Max";

        System.out.println(d1);
        System.out.println("==================================================");

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(100);

        ArrayList<Integer> list2 = list1;
        list2.addAll(Arrays.asList(200, 300, 400));

        System.out.println("list1 = " + list1);
        System.out.println("list2 = " + list2);
        System.out.println(list1 == list2);
        System.out.println("==================================================");

        Student s1 = new Student("Tahir", 'M', 30, 14, 'B');
        s1.grade = 'A';
        Student s2 = s1;
        s2.name = "Ahmet";

        System.out.println(s1);
        System.out.println(s2);
        System.out.println("==================================================");

        ArrayList<String> L1 = new ArrayList<>();
        L1.add("Java");
        ArrayList<String> L2 = L1;
        L2.add("Python");

        System.out.println("L1 = " + L1);
        System.out.println("L2 = " + L2);

    }
}
