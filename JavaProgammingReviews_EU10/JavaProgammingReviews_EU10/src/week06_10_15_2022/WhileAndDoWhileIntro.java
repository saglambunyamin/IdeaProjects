package week06_10_15_2022;

public class WhileAndDoWhileIntro {
    public static void main(String[] args) {

        boolean flag = true;
        int i = 0;

        while (flag) {
            System.out.print(i++ + " ");
            if ( i == 40) {
                flag =false;
            }
        }

    }
}
