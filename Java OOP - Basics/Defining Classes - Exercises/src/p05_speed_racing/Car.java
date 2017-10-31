package p05_speed_racing;

class Car {
    private static final double DEFAULT_DISTANCE_TRAVELED = 0;

    private String model;
    private double fuelAmount;
    private double fuelCostPerKM;
    private double distanceTraveled;

    public Car(String model, double fuelAmount, double fuelCostPerKM) {
        this.model = model;
        this.fuelAmount = fuelAmount;
        this.fuelCostPerKM = fuelCostPerKM;
        this.distanceTraveled = DEFAULT_DISTANCE_TRAVELED;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getFuelAmount() {
        return fuelAmount;
    }

    public void setFuelAmount(double fuelAmount) {
        this.fuelAmount = fuelAmount;
    }

    public double getFuelCostPerKM() {
        return fuelCostPerKM;
    }

    public void setFuelCostPerKM(double fuelCostPerKM) {
        this.fuelCostPerKM = fuelCostPerKM;
    }

    public double getDistanceTraveled() {
        return distanceTraveled;
    }

    public void setDistanceTraveled(double distanceTraveled) {
        this.distanceTraveled = distanceTraveled;
    }

    public void drive(double distance) {
        if (this.fuelAmount >= distance * this.fuelCostPerKM) {
            this.fuelAmount -= distance * this.fuelCostPerKM;
            this.distanceTraveled += distance;
        } else {
            System.out.println("Insufficient fuel for the drive");
        }
    }

    @Override
    public String toString() {
        return String.format("%s %.2f %.0f", this.model, this.fuelAmount, this.distanceTraveled);
    }
}
