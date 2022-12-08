package day24_CustomMethod_Return;

public class BreakfastTasks {
    public static void main(String[] args) {

        initialsOfPerson("Benjamin", "Strong");
        System.out.println("----------------------");

        domain("saglambunyamin@gmail.com");
        System.out.println("----------------------");

        String [] emails = {"josh@gmail.com", "jim@yahoo.com", "elminur@cydeo.com", "gulsen@gmail.com"};
        for (String email: emails) {
            domain(email);
        }
        System.out.println("----------------------");

        nameOfMonth(10);

    }

    public static void initialsOfPerson (String firstName, String lastName) {
        char first = firstName.toUpperCase().charAt(0);
        char last = lastName.toUpperCase().charAt(0);
        System.out.println(first + "." + last);
    }

    public static void domain (String email) {
        String domain = email.substring(email.indexOf("@")+1, email.lastIndexOf(".") );
        System.out.println("Domain is " + domain);
    }

    public static void nameOfMonth (int number) {
        String name = "";
        if (number >= 1 && number <= 12) {
            name = (number == 1) ? "January" : (number == 2) ? "February" : (number == 3) ? "March" :
                    (number == 4) ? "April" : (number == 5) ? "May" : (number == 6) ? "June" :
                            (number == 7) ? "July" : (number == 8) ? "August" : (number == 9) ? "September" :
                                    (number == 10) ? "October" : (number == 11) ? "November" : "December";
        } else {
            name = "Invalid";
        }
        System.out.println("Month Name is: " + name);
    }


}
