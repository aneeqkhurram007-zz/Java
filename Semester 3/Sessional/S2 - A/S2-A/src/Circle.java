public class Circle implements GeometricObject {
    protected double radius = 1.0;
    private int ShapeId = 0;
    private static int count = 0;

    public Circle(double radius) {
        this.radius = radius;
        ShapeId = ++count;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public int getShapeId() {
        return ShapeId;
    }

    @Override
    public String toString() {
        return "Circle [radius=" + radius + "ShapeId=" + ShapeId + "Perimeter=" + getPerimeter() + "Area=" + getArea()
                + "]";
    }

}
