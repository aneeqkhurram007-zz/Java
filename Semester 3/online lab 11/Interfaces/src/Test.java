import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Random;

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

        stats.add(new CountryClass("India", provinces(), states()));

        stats.add(new CountryClass("Afghanistan", provinces(), states()));

        for (Stats stats2 : stats) {
            printStats(stats2);
        }

    }

    static void printStats(@NotNull Stats stats) {
        stats.computeArea();
        stats.reset();
    }

    static Integer @NotNull [] provinces() {
        Integer[] provinceStates = new Integer[3];
        Random random = new Random();
        provinceStates[0] = random.nextInt(1000);
        provinceStates[1] = random.nextInt(1000);
        provinceStates[2] = random.nextInt(1000);

        return provinceStates;
    }

    static @NotNull ArrayList<Integer> states() {
        ArrayList<Integer> statesArea = new ArrayList<>();
        Random random = new Random();
        statesArea.add(random.nextInt(1000));
        statesArea.add(random.nextInt(1000));
        statesArea.add(random.nextInt(1000));

        return statesArea;
    }
}
