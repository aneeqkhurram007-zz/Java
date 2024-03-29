public class Rectangle extends Shape {
    private double width = 1.0;
    private double length = 1.0;

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
        return "\n" + getClass().getSimpleName() + "\n" + "Rectangle with length = " + getLength() + ", width=" + width
                + " has an Area = " + getArea();
    }

    @Override
    public double getArea() {
        return getWidth() * getLength();
    }

    @Override
    public void computeArea() {
        String output = toString() + " " + units;
        System.out.println(output);
    }

    @Override
    public void reset() {
        setWidth(0);
        setLength(0);
    }

}
