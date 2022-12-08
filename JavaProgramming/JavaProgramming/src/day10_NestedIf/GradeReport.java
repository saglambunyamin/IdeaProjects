package day10_NestedIf;

public class GradeReport {
    public static void main(String[] args) {

        int score = 45;

        if(score>=0 && score <=100) {
           if(score>=90) {
               System.out.println("YOUR SCORE IS EXCELLENT");
           } else if (score >=80) {
               System.out.println("YOUR SCORE IS GREAT");
           } else if (score>= 70) {
               System.out.println("YOUR SCORE IS GOOD");
           } else if (score>=60) {
               System.out.println("YOUR SCORE IS PASSED");
           } else {
               System.out.println("YOUR SCORE IS FAILED");
           }
        } else {
            System.out.println("INVALID SCORE!!!");
        }

    }
}
