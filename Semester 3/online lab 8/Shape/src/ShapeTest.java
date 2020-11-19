import java.util.ArrayList;

public class ShapeTest {
    public static void main(String[] args) {

        ArrayList<Shape> r = new ArrayList<>();

        r.add(new Rectangle());
        r.add(new Rectangle(2.0, 3.0));
        r.add(new Rectangle("Red", false, 5.0, 3.0));
        r.add(new Square());
        r.add(new Square(3.0));
        r.add(new Square("Green", false, 4.0));

        for (Shape shape : r) {

            System.out.println("\nShape # " + (r.indexOf(shape) + 1));
            System.out.println(" Area is = " + shape.getArea());
            System.out.println(" Perimeter is = " + shape.getPerimeter());
            System.out.println(shape);
        }

    }
}
