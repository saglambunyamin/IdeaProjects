package week13_12_03_2022.Inheritance;

public class MobileApp {

    public String name;
    public double version;

    public MobileApp(String name, double version) {
        this.name = name;
        this.version = version;
    }

    public void useTheApp(int minutes) {
        System.out.println("The user is using " + name + " the application for " + minutes + " münutes");
    }
    public void download() {
        System.out.println( name + " application is being downloaded by the user.");
    }

    public String toString() {
        return "MobileApp{" +
                "Name= '" + name + '\'' +
                ", Version= " + version +
                '}';
    }

}
/*
Task 3: appTask:
Create a class called MobileApp
            instance variables:
                name, version

                add a constructor to set all the fields

            instance methods:
                useTheApp(int minutes), download()

        Create the following sub classes of MobileApp:
            1. Instagram:
                    extra methods:
                        postPhoto()
            2. Discord:
                    extra methods:
                        chat(String name)
 */