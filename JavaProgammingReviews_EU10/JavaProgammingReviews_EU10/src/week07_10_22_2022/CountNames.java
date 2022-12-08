package week07_10_22_2022;

public class CountNames {
    public static void main(String[] args) {

        String names = "Adam Adam Barry Aysun Aysun";
        String  search = "Adam";

        int count = 0;

        while (names.contains(search)) {
            count++;
            names.replaceFirst(search,"");
        }
        System.out.println("count = " + count);
    }
}
