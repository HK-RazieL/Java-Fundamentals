package p07_car_salesman;

class Engine {
    public static final String DEFAULT_DISPLACEMENT = "n/a";
    public static final String DEFAULT_EFFICIENCY = "n/a";

    private String model;
    private int power;
    private String displacement;
    private String efficiency;

    public Engine() {
    }

    public Engine(String model, int power) {
        this.model = model;
        this.power = power;
        this.displacement = DEFAULT_DISPLACEMENT;
        this.efficiency = DEFAULT_EFFICIENCY;

    }

    public Engine(String model, int power, String efficiency) {
        this(model, power);
        this.efficiency = efficiency;
    }

    public Engine(String model, int power, String displacement, String efficiency) {
        this(model, power);
        this.displacement = displacement;
        this.efficiency = efficiency;
    }

    public String getModel() {
        return this.model;
    }

    public int getPower() {
        return power;
    }

    public String getDisplacement() {
        return displacement;
    }

    public String getEfficiency() {
        return efficiency;
    }

    public void setDisplacement(String displacement) {
        this.displacement = displacement;
}
}
