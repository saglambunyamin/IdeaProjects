package ReplitTasks;
import java.util.*;

public class AppendPositiveSum {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.nextInt());
        }
        System.out.println(appendPosSum(list));
    }

    public static ArrayList<Integer> appendPosSum(ArrayList<Integer> list){
        ArrayList<Integer> pos = new ArrayList<>();

        for (Integer each : list) {
            if (each > 0) {
                pos.add(each);
            }
        }
        return pos;
    }

}
 /*
 ### Finish the method called `appendPosSum()` that will take an `ArrayList<Integer>` argument `list` and returns an `ArrayList<Integer>`. The `ArrayList` return should have only positive numbers with the sum of all those positive numbers added to the end of the list. The `appendPosSum()` method is already called in the main method with an argument.

#### This is a `return` method with an `ArrayList<Integer>` parameter

Main topics: methods, Scanner, ArrayList, loops, statements

Example:
	appendPosSum([4,-6,3,-8,0,4,3]);
    output: [4,3,4,3,14]

Example:
	appendPosSum([-3, -1, 4, 2, -2]);
    output: [4, 2, 6]

  */