package day53_FunctionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class BuildInFunctionalInterfaces1 {
    public static void main(String[] args) {

        Predicate<String> isPalindrome = (p) -> {
            String reverse = new StringBuilder(p).reverse().toString();
            return reverse.equalsIgnoreCase(p);
        };
        System.out.println("is Palindrome civic = " + isPalindrome.test("civic"));

        List<String> names = new ArrayList<>(Arrays.asList("Level", "Anna", "Java", "Python"));
        System.out.println("names = " + names);
        names.removeIf(isPalindrome);
        System.out.println("names = " + names);

        System.out.println("==================================================");

        Predicate<Integer> isEven = p -> p%2 == 0;
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,1,2,3,4,5,6,7,1,2,3));
        System.out.println("list = " + list);
        list.removeIf(isEven);
        System.out.println("list = " + list);

        System.out.println("==================================================");

        Consumer<String> printEach = (s) -> {
            for (int i = 0; i < s.length(); i++) {
                System.out.print(s.charAt(i) + "  ");
            }
        };
        printEach.accept("PYTHON");

        System.out.println("==================================================");

        List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3, 34, 5, 6, 7, 8, 9));
        list2.forEach( p -> {  if (  p % 2 != 0  ) System.out.println(p);} );

        System.out.println("==================================================");

        List<String> employees = new ArrayList<>();
        employees.addAll(Arrays.asList("Anel Adilbayeva", "Aygun Abbasova Jarullah",
                "Jilili Jiwuer", "Ali Ismayilov"));
        employees.forEach(s -> System.out.println(s.charAt(0) + "." + s.charAt(s.lastIndexOf(" ") + 1)));

        System.out.println("==================================================");

        Function<int[], List<Integer>> convertToList = (a) -> {
            List<Integer> result = new ArrayList<>();
            for (int each : a) {
                result.add(each);
            }
            return result;
        };

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        List<Integer> l = convertToList.apply(arr);

        System.out.println(l);

        System.out.println("==================================================");

        Function<List<Integer>, int []> convertToArray = (a) -> {
            int[] result = new int [a.size()];
            for (int i = 0; i < a.size(); i++) {
                result [i] = a.get(i);
            }
            return  result;
        };

        List<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        System.out.println(convertToArray.apply(numbers));

    }
}
