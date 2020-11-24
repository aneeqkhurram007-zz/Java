public class Square extends Rectangle {

    public Square() {

    }

    public Square(double side) {
        super(side, side);
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }

    public void setWidth(double side) {
        this.width = side;
        this.length = side;

    }

    public void setLength(double side) {
        this.width = side;
        this.length = side;
    }

    public String toString() {
        return " A square with side = " + this.length + super.toString();
    }
}
