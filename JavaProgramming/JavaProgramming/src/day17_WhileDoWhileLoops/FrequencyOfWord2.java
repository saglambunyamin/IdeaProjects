package day17_WhileDoWhileLoops;

public class FrequencyOfWord2 {
    public static void main(String[] args) {

        String str = "cat cat dog dog cAT cAt Cat";
        int frequency = 0;
        for (int i = 0; i < str.length() - 2 ; i++) {
            String eachSub = str.substring(i, i+3);
            if (eachSub.equals("cat") ) {  //==> if you use if (eachSub.equalsIgnoreCase("cat")) result will be 5.
                frequency++;
            }
        }
        System.out.println("frequency = " + frequency);
    }
}