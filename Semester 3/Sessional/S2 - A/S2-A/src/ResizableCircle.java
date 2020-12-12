public class ResizableCircle extends Circle implements Resizable {
    private int ShapeId = 0;
    private static int count = 0;

    public ResizableCircle(double radius) {
        super(radius);
        ShapeId = ++count;
    }

    public void resize(int percentage) {
        this.radius = (this.radius) * (percentage / 100);
    }

    public int getShapeId() {
        return ShapeId;
    }
}
