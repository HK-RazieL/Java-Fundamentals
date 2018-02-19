package p07_food_storage;

public class Rebel implements Individual, Buyer{
    String name;
    int age;
    String group;
    int food;

    public Rebel(String name, int age, String group) {
        this.name = name;
        this.age = age;
        this.group = group;
    }

    public int getFood() {
        return this.food;
    }

    @Override
    public int buyFood() {
        return this.food += 5;
    }

    @Override
    public Long getId() {
        return null;
    }

    @Override
    public String getBirthday() {
        return null;
    }
}
