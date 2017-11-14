package p02_method_overriding;

public class Square extends Rectangle {
    public Square(double side) {
        super(side);
    }

    @Override
    public double area() {
        return this.sideA * this.sideA;
    }
}
