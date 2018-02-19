package p05_border_control;

public class Person implements Individual{
    String name;
    int Age;
    String id;

    public Person(String name, int age, String id) {
        this.name = name;
        Age = age;
        this.id = id;
    }

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public String toString() {
        return this.id;
    }
}
