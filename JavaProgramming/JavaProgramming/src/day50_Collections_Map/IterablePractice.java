package day50_Collections_Map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IterablePractice {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,1,2,3,4,5,1,2,3,4,5));
        for (int i = 0; i < list.size(); i++) {
            if (  list.get(i) < 4  ) {
                list.remove(i);
            }
        }
        System.out.println("list = " + list);
        System.out.println("==================================================");

        List<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3,4,5,1,2,3,4,5,1,2,3,4,5));
        Iterator<Integer> it = list2.iterator();

/*
        boolean r1=  it.hasNext();
        System.out.println("r1 = " + r1);
        System.out.println("it.next = " + it.next());

        boolean r2=  it.hasNext();
        System.out.println("r2 = " + r1);
        System.out.println("it.next = " + it.next());
*/

        while (it.hasNext()) {
            if (  it.next() < 4  ) {
                it.remove();
            }
        }
        System.out.println("list2 = " + list2);


    }
}
