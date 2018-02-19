package p07_food_storage;

public class Pet implements Individual {
    String name;
    String birthday;

    public Pet(String name, String birthday) {
        this.name = name;
        this.birthday = birthday;
    }


    @Override
    public Long getId() {
        return null;
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
