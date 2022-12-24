package week16_12_24_2022.Final_Keyword.Final_With_Variable;

public class Person {

    private String name;
    final private String birthDay;

    public Person(String birthDay, String name) {
        this.birthDay = birthDay;
        setName(name);
    }

    public String getBirthDay() {
        return birthDay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birthDay='" + birthDay + '\'' +
                '}';
    }
}
