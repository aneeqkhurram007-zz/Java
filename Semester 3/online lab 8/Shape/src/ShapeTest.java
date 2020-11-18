import java.util.ArrayList;

public class ShapeTest {
    public static void main(String[] args) {

        ArrayList<Rectangle> r = new ArrayList<>();
        ArrayList<Square> s = new ArrayList<>();

        r.add(0, new Rectangle());
        r.add(1, new Rectangle(2.0, 3.0));
        r.add(2, new Rectangle("Red", false, 5.0, 3.0));

        s.add(0, new Square());
        s.add(1, new Square(3.0));
        s.add(2, new Square("Green", true, 4.0));

        System.out.println("\tRectangle");
        for (Rectangle rectangle : r) {
            rectangle.getArea();
            rectangle.getPerimeter();
            System.out.println(rectangle);
        }
        System.out.println("\tSquare");
        for (Square rectangle : s) {
            rectangle.getArea();
            rectangle.getPerimeter();
            System.out.println(rectangle);
        }

    }
}
