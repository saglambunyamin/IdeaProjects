package week13_12_03_2022.Encapsulation;

public class Student {

    private String name;
    private int age;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        if (name == "XXXXX") {
            System.out.println("Invalid name");
        } else {
            this.name = name;
        }
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age <= 0) {
            System.out.println("Invalid age!!!");
        } else {
            this.age = age;
        }
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
