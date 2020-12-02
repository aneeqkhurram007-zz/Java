public class Rectangle extends Shape {
    private double width;
    private double length;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        setWidth(width);
        setLength(length);
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        setWidth(width);
        setLength(length);
    }

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

    @Override
    public String toString() {
        return "Rectangle [length=" + length + ", width=" + width + "]";
    }

    @Override
    public double getArea() {
        return getWidth() * getLength();
    }

    @Override
    public double getPerimeter() {
        return 2 * (getWidth() + getLength());
    }

    @Override
    public void computeArea() {
        System.out.println("Area of rectangle = " + getArea() + " " + units);
    }

    @Override
    public void reset() {
        setWidth(0);
        setLength(0);
    }

}
