package day10_NestedIf;

public class TernariesWithNestedIf {
    public static void main(String[] args) {

        int s = 40;

        String result = (s>=0 && s<=100)? (s>=60)?"PASSED":"FAILED":"INVALID SCORE!!!";
        System.out.println(result);
    }
}
