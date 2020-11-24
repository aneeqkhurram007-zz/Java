/**
 * Rectangle
 */
public class Rectangle extends Shape {
    double width;
    double length;
    int count;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;

    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public Rectangle() {
        this.width = 1.0;
        this.length = 1.0;
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getArea() {
        return this.length * this.width;
    }

    public double getPerimeter() {
        return 2 * this.length + 2 * this.width;
    }

    public String toString() {

        return " A rectangle with width = " + this.width + " and length = " + this.length + super.toString();
    }
}