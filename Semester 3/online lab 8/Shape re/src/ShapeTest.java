
public class ShapeTest {
    public static void main(String[] args) {

        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle("Red", false, 5.0, 3.0);
        Rectangle r3 = new Rectangle(2.0, 3.0);

        System.out.println("R1");
        System.out.println(" Area is = " + r1.getArea());
        System.out.println(" Perimeter is = " + r1.getPerimeter());
        System.out.println(r1);

        System.out.println("R2");
        System.out.println(" Area is = " + r2.getArea());
        System.out.println(" Perimeter is = " + r2.getPerimeter());
        System.out.println(r2);

        System.out.println("R3");
        System.out.println(" Area is = " + r3.getArea());
        System.out.println(" Perimeter is = " + r3.getPerimeter());
        System.out.println(r3);

        Square s1 = new Square();
        Square s2 = new Square(3.0);
        Square s3 = new Square("Green", false, 4.0);

        System.out.println("s1");
        System.out.println(" Area is = " + s1.getArea());
        System.out.println(" Perimeter is = " + s1.getPerimeter());
        System.out.println(s1);

        System.out.println("s2");
        System.out.println(" Area is = " + s2.getArea());
        System.out.println(" Perimeter is = " + s2.getPerimeter());
        System.out.println(s2);

        System.out.println("s3");
        System.out.println(" Area is = " + s3.getArea());
        System.out.println(" Perimeter is = " + s3.getPerimeter());
        System.out.println(s3);
    }
}
