package p03_shapes;

public abstract class Shape {
    private double perimeter;
    private double area;


    public Shape() {
        this.perimeter = calculatePerimeter();
        this.area = calculateArea();
    }

    public final double getPerimeter() {
        return perimeter;
    }

    public final double getArea() {
        return area;
    }

    public abstract double calculatePerimeter();

    public abstract double calculateArea();

}
