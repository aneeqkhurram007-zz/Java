import java.util.*;

public class CircleMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double radius;

        System.out.print("Enter radius of a circle: ");
        radius = input.nextDouble();

        Circle circle = new Circle(radius);

        System.out.printf("Area of a circle is: %.2f\n", circle.calculateArea());
        System.out.printf("Perimeter of a circle is: %.2f\n", circle.calculatePerimeter());

        input.close();
    }
}
