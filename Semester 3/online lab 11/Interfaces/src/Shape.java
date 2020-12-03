
public abstract class Shape implements Stats {

    private String color;
    private boolean filled;

    public Shape() {
        setColor("red");
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

    public Shape(String color, boolean filled) {
        setColor(color);
        setFilled(filled);
    }

    @Override
    public String toString() {
        return "Shape [color=" + getColor() + ", filled=" + isFilled() + "]";
    }

    public abstract double getArea();

}