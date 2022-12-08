package day07_Operators;

public class Numan {

    public static void main(String[] args) {

        long ilkSayi = 857423658584655845L;
        int bolen = 153;
        long kalan = ilkSayi % bolen;


        System.out.println(ilkSayi+" sayısının "+bolen+" ile bölümünden kalan = " + kalan);


        int a = 10;
        //       9     9     10    9
        int n = --a + a++ + a-- + a++;
        System.out.println(n);
    }
}
