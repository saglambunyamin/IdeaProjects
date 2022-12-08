package day08_IfStatements;

public class GradeReport {

    public static void main(String[] args) {

        int score = 65;
        boolean a = score >= 90 && score <= 100;
        boolean b = score >= 80 && score <= 89;
      //boolean b = score >= 80 && !a;
        boolean c = score >= 70 && score <= 79;
      //boolean c = score >= 70 && !a && !b;
        boolean d = score >= 60 && score <= 69;
        boolean e = score < 60 && score > 0;

        if(a) {
            System.out.println("Your grade is EXCELENT");
        }
        if(b) {
            System.out.println("Your grade is GREAT");
        }
        if(c) {
            System.out.println("Your grade is GOOD");
        }
        if(d) {
            System.out.println("Your grade is PASSED");
        }
        if(e) {
            System.out.println("Your grade is FAILED");
        }
    }

}
