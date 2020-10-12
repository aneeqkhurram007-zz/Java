public class Circle {
    private double radius;

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radiusMain) {
        if (radiusMain > 0)
            this.radius = radiusMain;
        else
            this.radius = 0;
    }

    public Circle(double radiusMain) {
        setRadius(radiusMain);

    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculatePerimeter() {
        return Math.PI * 2 * radius;
    }
}
