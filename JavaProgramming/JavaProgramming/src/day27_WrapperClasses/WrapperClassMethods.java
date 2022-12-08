package day27_WrapperClasses;

public class WrapperClassMethods {
    public static void main(String[] args) {

        String str = "123";
        int num = Integer.parseInt(str);
        System.out.println(num + 1); //124
        System.out.println(str + 1); //1231

        String str2 = "10.5";
        double num2 = Double.parseDouble(str2);
        System.out.println(num2 + 1); //11.5

        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        System.out.println("max = " + max);
        System.out.println("min = " + min);

        long max2 = Long.MAX_VALUE;
        long min2 = Long.MIN_VALUE;

        System.out.println("max2 = " + max2);
        System.out.println("min2 = " + min2);

        String s1 = "true"; //when we use anything expect true, it is gonna false
        boolean r1=  Boolean.parseBoolean(s1);
        System.out.println("r1 = " + r1);
        System.out.println("---------------------------------------------------");

        String s2 = "123";
        Integer x = Integer.valueOf(s2);
        System.out.println("x = " + x);

        int y = Integer.valueOf(s2);
        System.out.println("y = " + y);
        System.out.println("--------------------------------------");

        String s3 = "1.5";
        double z = Double.valueOf(s3);
        System.out.println("z = " + z);
        System.out.println("--------------------------------------");

        char ch1 = '0';
        boolean r2 = Character.isDigit(ch1);
        System.out.println("r2 = " + r2);

        char ch2 = 'A';
        boolean r3 = Character.isLetter(ch2);
        System.out.println("r3 = " + r3);

        char ch3 = '&'; //for special characters
        boolean r4 = !Character.isLetterOrDigit(ch3);
        System.out.println("r4 = " + r4);

        char ch4 = 'A';
        boolean r5 = Character.isUpperCase(ch4);
        System.out.println("r5 = " + r5);

        char ch5 = 'b';
        boolean r6 = Character.isLowerCase(ch5);
        System.out.println("r6 = " + r6);
        System.out.println("---------------------------------------");

        String s = "ab1cde2efg3hi4";
        int sum = 0;
        for (char each : s.toCharArray()) {
            if ( Character.isDigit(each) ) {
                sum += Integer.parseInt("" + each);
            }
        }
        System.out.println("sum = " + sum);
    }

}
