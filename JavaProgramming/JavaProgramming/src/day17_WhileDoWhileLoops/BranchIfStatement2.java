package day17_WhileDoWhileLoops;

public class BranchIfStatement2 {
    public static void main(String[] args) {

        for (char i = 'A'; i <= 'E'; i++) {
        if (i == 'C') {
            continue;
        }
            System.out.print(i);
        }

        System.out.println("\n------------------------------------");

        for (int i = 1; i <=10 ; i++) {
           if(!(i%2 == 0)) {
                continue;
            }
            System.out.print(i + " ");
        }

        System.out.println("\n------------------------------------");

        for (int i = 1; i <=10 ; i++) {
            if(i%2 == 0) {
                continue;
            }
            System.out.print(i + " ");
        }

    }
}
