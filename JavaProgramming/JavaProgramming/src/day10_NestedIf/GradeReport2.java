package day10_NestedIf;

public class GradeReport2 {
    public static void main(String[] args) {
        int s = 105;

        String r = (s >= 0 && s <= 100)? (s>=90)?"EXCELLENT":(s>=80)?"GREAT"
                :(s>=70)?"GOOD":(s>=60)?"PASSED":"FAILED":"INVALID SCORE!!!";
        System.out.println(r);

    }
}
/*         int score = 45;

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

 */