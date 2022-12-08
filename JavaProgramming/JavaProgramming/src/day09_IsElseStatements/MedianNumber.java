package day09_IsElseStatements;

public class MedianNumber {

    public static void main(String[] args) {

        int a = 25;
        int b = 35;
        int c = 20;

        boolean x = a<c && a>b || a>c && a<b;
        boolean y = b<c && b>a || b>c && b<a;
        boolean z = !x && !y;

        if(x) {
            System.out.println(a+" is the median number.");
        }
        if(y) {
            System.out.println(b+" is the median number");
        }
        if(z) {
            System.out.println(c+" is the median number");
        }
    }
}
