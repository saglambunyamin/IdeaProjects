package week10_11_12_2022;

public class Task5_countTheWordInArray {
    public static void main(String[] args) {

        String [] arr = {"java", "html", "css", "java", "javascript", "selenium"};
        String target = "java";

        int result = countTheWordInArray(arr,target);
        System.out.println("result = " + result);

    }

    public static int countTheWordInArray (String [] arr, String target) {

        int count = 0;
        for (String each : arr) {

            if (each.equalsIgnoreCase(target))
                count++;
        }
        return count;
    }



}
