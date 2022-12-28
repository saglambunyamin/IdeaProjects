package day43_Abstraction.Employee;

public abstract class Person {
    private String name;
    private int age;
    private char gender;

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age < 0 || age >150) {
            throw new RuntimeException("Invalid Age: " + age);
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }
    public void setGender(char gender) {
        if ( ! (( gender == 'M')|| ( gender == 'F' ) ) ) {
            throw new RuntimeException("Invalid Gender Type: " + gender);
        }
        this.gender = gender;
    }

    public abstract void sleep ();
    public void eat () {
        System.out.println(name + " is eating baklava");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }

}
