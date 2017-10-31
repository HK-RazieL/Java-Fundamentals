package p07_car_salesman;

public class Car {
    public static final String DEFAULT_WEIGHT = "n/a";
    public static final String DEFAULT_COLOR = "n/a";

    private String model;
    private Engine engine;
    private String weight;
    private String color;

    public Car() {
    }

    public Car(String model, Engine engine) {
        this.model = model;
        this.engine = engine;
        this.weight = DEFAULT_WEIGHT;
        this.color = DEFAULT_COLOR;
    }


    public Car(String model, Engine engine, String color) {
        this(model, engine);
        this.color = color;
    }

    public Car(String model, Engine engine, String weight, String color) {
        this(model, engine);
        this.weight = weight;
        this.color = color;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return model + ":\n" +
                "  " + engine.getModel() + ":\n" +
                "    Power: " + engine.getPower() + "\n" +
                "    Displacement: " + engine.getDisplacement() + "\n" +
                "    Efficiency: " + engine.getEfficiency() + "\n" +
                "  Weight: " + weight + "\n" +
                "  Color: " + color;
    }
}
