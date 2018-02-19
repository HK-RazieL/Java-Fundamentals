package p03_ferrari;

class Ferrari implements Car{
    String model = "488-Spider";
    String driver;

    public Ferrari(String driver) {
        this.driver = driver;
    }

    @Override
    public String getModel() {
        return this.model;
    }

    @Override
    public String getDriver() {
        return this.driver;
    }

    @Override
    public String breaks() {
        return "Brakes!";
    }

    @Override
    public String gas() {
        return "Zadu6avam sA!";
    }

    @Override
    public String toString() {
        return String.format("%s/%s/%s/%s", this.model, this.breaks(), this.gas(), this.driver);
    }
}
