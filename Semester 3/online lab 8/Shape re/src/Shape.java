public class Shape {
    String color;
    boolean filled;

    public Shape() {
        this.color = "Red";
        this.filled = false;
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
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
        return " A " + this.filled + " Shape with " + this.color + " color.";
    }

    public double getArea() {
        return 0;
    }

    public double getPerimeter() {
        return 0;
    }

}
