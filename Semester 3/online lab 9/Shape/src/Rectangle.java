public class Rectangle extends Shape {
    private double width;
    private double length;

    public Rectangle() {
        setWidth(1.0);
        setLength(1.0);

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

    public double getArea() {
        return getLength() * getWidth();
    }

    public double getPerimeter() {
        return 2 * getLength() + 2 * getWidth();
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
        return " A Rectangle with width = " + getWidth() + " and length = " + getLength() + " which is a subclass of "
                + super.toString();
    }

}
