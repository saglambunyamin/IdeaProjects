package Zulfikar_11_30_2022;

public class ForEachLoopTask2 {
    public static void main(String[] args) {

        String [] names = {"Harold8000", "Jack3000", "Ahmet6000", "Sakushi7000"};

        String number = "";
        for (String name : names) {
            number = name.substring(name.length()-4);
            int salary = Integer.valueOf(number);
            System.out.println(salary);
        }

    }
}
