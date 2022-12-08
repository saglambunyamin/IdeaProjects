package Zulfikar_11_30_2022;

import java.util.Scanner;

public class Two_Task {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter A Number");
        int number = input.nextInt();

        for (int i = 0; i <= number; i++) {
            for (int j = 0; j <= number; j++) {
                for (int k = 0; k <= number; k++) {
                    if(i+j+k== number)
                        System.out.print(""+i+j+k);
                }
                System.out.println();
            }

        }


    }
}
