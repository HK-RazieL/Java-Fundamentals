package p06_raw_data;

class Car {
    private String model;
    private Engine engine;
    private Cargo cargo;
    private Tyres tyres;

    Car(String model, Engine engine, Cargo cargo, Tyres tyres) {
        this.model = model;
        this.engine = engine;
        this.cargo = cargo;
        this.tyres = tyres;

    }

    public String getModel() {
        return model;
    }

    public Engine getEngine() {
        return engine;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public Tyres getTyres() {
        return tyres;
    }
}