public class Shape {
    private String color;
    private boolean filled;

    public Shape() {
        setColor("Green");
        setFilled(true);
    }

    public Shape(String color, boolean filled) {
        setColor(color);
        setFilled(filled);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String toString() {
        return " A " + isFilled() + " Shape with " + getColor() + " color.";
    }

    public double getArea() {
        return 0;
    }

    public double getPerimeter() {
        return 0;
    }

}
