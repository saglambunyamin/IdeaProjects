package week07_10_22_2022;

public class CatReplaceDog {
    public static void main(String[] args) {

        String message = "I love cats! I have a cat named Coco. My cat's very smart!";
        String searched = "cat";
        String changed = "dog";

        int indexOfFirsCat = message.indexOf(searched);
        int endOfWord = indexOfFirsCat+searched.length();

        message = message.substring(0,indexOfFirsCat)+changed+message.substring(endOfWord);

        while(message.contains(searched)) {

            message = message.substring(0,indexOfFirsCat)+changed+message.substring(endOfWord);

        }
        System.out.println(message);


    }
}
