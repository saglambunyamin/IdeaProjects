package Zulfikar_11_09_2022;

public class NestedIfStatement {
    public static void main(String[] args) {

        boolean isEmployee = true;
        boolean isStudent = true;
        boolean isOldStudent = true;
        boolean isAccountDep = true;
        boolean isSalesDep = true;

        if (isEmployee) {
            if (isAccountDep){
                System.out.println("Please Go To Account Office");
            } else if (isSalesDep) {
                System.out.println("Please Go To Sales Office");
            }
        } else if (isStudent) {
            if (isOldStudent) {
                System.out.println("Please Go To Classroom");
            } else {
                System.out.println("Get Out Of Here!");
            }
        }

    }
}
