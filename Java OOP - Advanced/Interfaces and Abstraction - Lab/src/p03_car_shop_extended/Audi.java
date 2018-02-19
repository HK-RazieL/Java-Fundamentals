package p03_car_shop_extended;

public class Audi implements Rentable{
    private String countryProduced;
    private String model;
    private String color;
    private Integer horsePower;
    private Integer minRentPerDay;
    private Double pricePerDay;

    public Audi(String model, String color, Integer horsePower, String countryProduced, Integer minRentPerDay, Double pricePerDay) {
        this.countryProduced = countryProduced;
        this.model = model;
        this.color = color;
        this.horsePower = horsePower;
        this.minRentPerDay = minRentPerDay;
        this.pricePerDay = pricePerDay;
    }

    @Override
    public Integer getMinRentDay() {
        return this.minRentPerDay;
    }

    @Override
    public Double getPricePerDay() {
        return this.pricePerDay;
    }

    @Override
    public String getModel() {
        return this.model;
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public Integer getHorsePower() {
        return this.horsePower;
    }

    @Override
    public String toString() {
        return String.format("This %s is produced in %s and have %d tires", this.model, this.countryProduced, p02_car_shop.Car.TIRES);
    }
}
