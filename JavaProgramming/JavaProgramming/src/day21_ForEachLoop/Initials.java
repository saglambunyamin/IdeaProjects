package day21_ForEachLoop;

public class Initials {
    public static void main(String[] args) {

        String[] name = {"Elminur Ablimit", "Ali Kilic", "Hulya Keles", "Simen Kaya", "Begench Begenjov", "Ruveyda Durna", "Jonathan Holly", "Alshaun Rodgers", "Manas Kalenov", "Gulsen Sohret"};

        for (String each : name) {
            String initial = each.charAt(0) + "." + each.charAt( each.indexOf(" ")+1 );
            System.out.println(initial);
        }

    }
}
