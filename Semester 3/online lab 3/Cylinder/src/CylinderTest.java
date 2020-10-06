import java.util.*;

public class CylinderTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double radius, height;
        System.out.println("Constructor With No Arg");
        Cylinder cylinder = new Cylinder();

        cylinder.displayInfo();

        System.out.println("\n\nConstructor With One Parameter");
        System.out.print("Enter value for height : ");
        height = input.nextDouble();
        Cylinder cylinder2 = new Cylinder(height);

        cylinder2.displayInfo();
        System.out.println("\n\nConstructor With Two Paramenters");
        System.out.print("Enter value for radius : ");
        radius = input.nextDouble();
        System.out.print("Enter value for height : ");
        height = input.nextDouble();

        Cylinder cylinder3 = new Cylinder(radius, height);
        cylinder3.displayInfo();
        System.out.println("\nOverloaded Method");
        Cylinder cylinder4 = new Cylinder();
        cylinder4.setCylinderData(6, 7);
        cylinder4.displayInfo();
        input.close();
    }
}
