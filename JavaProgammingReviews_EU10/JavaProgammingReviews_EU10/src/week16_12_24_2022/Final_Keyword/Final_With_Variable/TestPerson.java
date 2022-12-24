package week16_12_24_2022.Final_Keyword.Final_With_Variable;

public class TestPerson {
    public static void main(String[] args) {

        Person p1 = new Person("14-01-1989", "Adam");
        // p1.birthDay = "14-10-1989"; --> when we use final keyword, we can not change the value
        System.out.println(p1);

        p1.setName("Adem");
        System.out.println(p1);

    }
}
