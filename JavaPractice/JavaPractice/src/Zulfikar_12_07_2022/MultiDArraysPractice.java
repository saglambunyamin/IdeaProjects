package Zulfikar_12_07_2022;

public class MultiDArraysPractice {
    public static void main(String[] args) {

        String [] [] fruits = new String[3][];

        String [] fruit = {"apple" , "banana" , "pear"};
        String [] price = {"10" , "12" , "4"};
        String [] count = {"100" , "190" , "200"};

        fruits [0] = fruit;
        fruits [1] = price;
        fruits[2] = count;

        System.out.println(fruits[0] [0]  + "'s price is " + fruits[1] [0] + " $, " + fruits[2] [0] + " left."   );
        System.out.println("===============================================");

        int[][] table = { {1,4,9},{11,4,3},{2,2,3} };
        int sum = 0;
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table [i].length; j++) {
                sum+= table [i] [j];
            }
        }
        System.out.println("sum = " + sum);

    }
}
