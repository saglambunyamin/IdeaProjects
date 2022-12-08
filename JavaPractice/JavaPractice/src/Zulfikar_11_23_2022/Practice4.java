package Zulfikar_11_23_2022;

public class Practice4 {
    public static void main(String[] args) {

        for (int i =0; i < 5; i++) {
            System.out.println( " ".repeat(9-i*2+1) + String.valueOf(i+1).repeat(i*2+1) );
        }

    }
}
/*
          1
        222
      33333
    4444444
  555555555
     */