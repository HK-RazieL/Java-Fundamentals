package p03_shapes;

public class Rectangle extends Shape{
    private double height;
    private double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public final double getHeight() {
        return height;
    }

    public final double getWidth() {
        return width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * this.height * this.width;
    }

    @Override
    public double calculateArea() {
        return this.height * this .width;
    }
}
