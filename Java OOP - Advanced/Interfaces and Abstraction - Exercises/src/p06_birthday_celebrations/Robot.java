package p06_birthday_celebrations;

public class Robot implements Individual{
    String model;
    Long id;

    public Robot(String model, Long id) {
        this.model = model;
        this.id = id;
    }

    @Override
    public Long getId() {
        return this.id;
    }

    @Override
    public String getBirthday() {
        return null;
    }

    @Override
    public String toString() {
        return null;
    }
}
