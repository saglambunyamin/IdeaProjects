package day35_Encapsulation;

public class CydeoStudent {

    public String name;
    public char gender;
    public int age, batchNumber, groupNumber;
    public static String schoolName;
    public String fieldOfStudy;
    public static String programmingLanguage;
    public static String secretCode;

    public CydeoStudent(String name, char gender, int age, int batchNumber, int groupNumber, String fieldOfStudy) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
        this.fieldOfStudy = fieldOfStudy;
    }

    static {
        schoolName = "CYDEO";
        programmingLanguage = "JAVA";
        secretCode = "Wooden Spoon";
    }

    public void attendClass () {
        System.out.println("<< " + name + " >> is attending to class.");
    }
    public void study () {
        System.out.println("<< " + name + " >> is studying.");
    }

    public static void printProgrammingLanguage () {
        System.out.println("Programming Language is: << " + programmingLanguage + " >>");
    }
    public static void printSchoolName () {
        System.out.println("School is: << " + schoolName + " >>");
    }
    public static void printSecretCode () {
        System.out.println("Secret Code is: << " + secretCode + " >>");
    }

    public String toString() {
        return "CydeoStudent{" +
                "Name: '" + name + '\'' +
                ", Gender: " + gender +
                ", Age: " + age +
                ", Batch Number: " + batchNumber +
                ", Group Number: " + groupNumber +
                ", Field Of Study: '" + fieldOfStudy + '\'' +
                "School Name: '" + schoolName + '\'' +
                "Programming Language: '" + programmingLanguage + '\'' +
                "Secret Code: '" + secretCode + '\'' +
                '}';
    }

}
