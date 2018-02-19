package p07_food_storage;

public class Citizen implements Individual, Buyer {
    String name;
    int Age;
    Long id;
    String birthday;
    int food;

    public Citizen(String name, int age, Long id, String birthday) {
        this.name = name;
        this.Age = age;
        this.id = id;
        this.birthday = birthday;
    }

    public int getFood() {
        return this.food;
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

    @Override
    public int buyFood() {
        return this.food += 10;
    }
}
