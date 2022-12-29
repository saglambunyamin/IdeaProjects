package day35_Encapsulation.CandiesTask;

import java.util.ArrayList;
import java.util.Arrays;

public class CandyFactory {
    public static void main(String[] args) {

        ArrayList<Candy> candyList = new ArrayList<>();

        Candy c1 = new Candy("Ulker", 1, 10, true);
        Candy c2 = new Candy("Dido", 2, 15, false);
        Candy c3 = new Candy("Karam", 1, 10, false);
        Candy c4 = new Candy("Tadelle", 3, 27, true);
        Candy c5 = new Candy("Biskrem", 2, 25, false);

        candyList.addAll(Arrays.asList(c1,c2,c3,c4,c5));

        for (Candy each : candyList) {
            System.out.println(each.getBrand() + ":" + each.getPrice());
        }



    }
}
