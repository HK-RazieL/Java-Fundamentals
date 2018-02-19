package p06_birthday_celebrations;

public class Person implements Individual{
    String name;
    int Age;
    Long id;
    String birthday;

    public Person(String name, int age, Long id, String birthday) {
        this.name = name;
        this.Age = age;
        this.id = id;
        this.birthday = birthday;
    }


    @Override
    public Long getId() {
        return this.id;
    }

    @Override
    public String getBirthday() {
        return this.birthday;
    }

    @Override
    public String toString() {
        return this.birthday;
    }
}
