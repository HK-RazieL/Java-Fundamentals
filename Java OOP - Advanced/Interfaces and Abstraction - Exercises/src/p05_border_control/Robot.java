package p05_border_control;

public class Robot implements Individual{
    String model;
    String id;

    public Robot(String model, String id) {
        this.model = model;
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
