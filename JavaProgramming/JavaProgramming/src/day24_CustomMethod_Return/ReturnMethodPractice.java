package day24_CustomMethod_Return;

public class ReturnMethodPractice {
    public static void main(String[] args) {

        int maxNumber = max(100,200);
        int multiplication = maxNumber *2 ;
        System.out.println("Max * 2 = " + multiplication);

    }

    public static int max (int a, int b) {
        int result = 0;
        if(a > b) {
                result = a;
            } else {
            result = b;
        }
            return result;
    }

}
