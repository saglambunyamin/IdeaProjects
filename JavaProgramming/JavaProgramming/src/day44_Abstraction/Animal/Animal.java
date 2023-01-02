package day44_Abstraction.Animal;

public abstract class Animal {
    private String name;
    private final String breed;
    private final char gender;
    private int age;
    private String size;
    private final String color;

    public final static boolean canBreath;
    static {
        canBreath = true;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        if (name.isEmpty()) {
            throw new RuntimeException("Name can not be Empty!");
        }
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age<=0 || age >100) {
            throw new RuntimeException("Invalid age: " + age);
        }
        this.age = age;
    }

    public String getSize() {
        return size;
    }
    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public Animal(String name, String breed, char gender, int age, String size, String color) {
        setName(name);
        this.breed = breed;
        if ( ! ( gender == 'M' || gender == 'F') ) {
            throw new RuntimeException("Invalid gender: " + gender);
        }
        this.gender = gender;
        setAge(age);
        setSize(size);
        this.color = color;
    }

    public abstract void eat();

    public final void drink() {
        System.out.println(name + " is drinking water");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "Name= '" + name + '\'' +
                ", Breed= '" + breed + '\'' +
                ", Gender= " + gender +
                ", Age= " + age +
                ", Size= '" + size + '\'' +
                ", Color= '" + color + '\'' +
                '}';
    }

}
