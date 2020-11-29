import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(new Rectangle());
        shapes.add(new Rectangle(2.0, 3.0));
        shapes.add(new Rectangle("red", false, 4.0, 5.0));

        shapes.add(new Square());
        shapes.add(new Square(3.0));
        shapes.add(new Square("yellow", true, 5.0));

        for (Shape shape : shapes) {
            System.out.println("\n" + shape.toString());
            System.out.println("\nArea = " + shape.getArea());
            System.out.println("\nPerimeter = " + shape.getPerimeter());
            if (shape instanceof Square) {
                Square s = (Square) shape;
                s.setWidth(s.getWidth() + 5);
            }
            System.out.println("\nArea = " + shape.getArea());

        }

    }
}
