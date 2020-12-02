import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

        ArrayList<Stats> stats = new ArrayList<>();
        // Rectangle
        stats.add(new Rectangle());
        stats.add(new Rectangle(5.0, 4.0));
        stats.add(new Rectangle("green", false, 3.0, 6.0));

        // Square
        stats.add(new Square());
        stats.add(new Square(6.0));
        stats.add(new Square("red", true, 4.0));

        // Country

        stats.add(new CountryClass());
    }

    static void printStats(Stats stats) {
        stats.computeArea();
        stats.reset();
    }
}
