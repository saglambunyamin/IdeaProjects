package Zulfikar_12_07_2022;

public class CustomMethods {
    public static void main(String[] args) {

        webAppTesting();
        manuelTesting("Benjamin");
        manuelTesting("Benjamin", "Amazon Project");
        manuelTesting("Benjamin", "Amazon Project", 6);

    }

    public static void manuelTesting (String name) {
        System.out.println(name + " is for manuel testing");
    }
    public static void manuelTesting (String name, String projectName) {
        System.out.println(name + " is doing manuel test for " + projectName);
    }
    public static void manuelTesting (String name, String projectName, int time) {
        System.out.println(name + " is doing manuel test for " + projectName + " and have to finish after " + time + " hours");
    }

    public static void webAppTesting () {
        System.out.println("This is for web app testing");
    }
    public static void apiTesting () {
        System.out.println("This is for api testing");
    }
    public static void dataBaseTesting () {
        System.out.println("This is for data base testing");
    }

}
