package day53_FunctionalInterface;

public class LambdaExpressions {
    public static void main(String[] args) {

        MyThirdFunctionalInterface<String> stringReverse = (n) -> {
            //String reverse = new StringBuilder(s).reverse().toString();

            String result = "";
                for (int i = n.length()-1; i >=0 ; i--) {
                    result+= n.charAt(i);
                }
            return result;
        };

        System.out.println("Reversed Text = " + stringReverse.method("Wooden Spoon"));

        System.out.println("==================================================");

        //create a function that can return the cube of an integer
        MyThirdFunctionalInterface<Integer> cubeInteger = (n) -> {
           return n*n*n;
        };

        System.out.println("Cube Integer (4) = " + cubeInteger.method(4));

    }
}
