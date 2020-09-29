public class Cylinder {
    private double radius;
    private double height;

    // Setters and Getters
    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // No Arg Default Constructor
    public Cylinder() {

        radius = 2;
        height = 3;
    }

    // One Arg Constructor
    public Cylinder(double heightArg1) {

        height = heightArg1;
        radius = 1;
    }

    // Two Arg Constructor
    public Cylinder(double radiusArg2, double heightArg2) {

        radius = radiusArg2;
        height = heightArg2;

    }

    public double computeArea() {
        return (2 * Math.PI * radius * radius) + height * (2 * Math.PI * radius);

    }

    public double computeVolume() {
        return (Math.PI * radius * radius * height);
    }

    public void displayInfo() {
        System.out.println(
                "Area of a cylinder with radius = " + radius + " and height = " + height + " : " + computeArea());
        System.out.println(
                "Volume of a cylinder with radius = " + radius + " and height = " + height + " : " + computeVolume());
    }
}
