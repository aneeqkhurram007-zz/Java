import java.util.*;

public class lab1 {

    public static void main(String[] args) {

        int i, starting;
        Scanner num = new Scanner(System.in);
        for (i = 1; i < 7; i++) {
            System.out.println("\nEnter Starting and Ending value for number: " + i);

            starting = num.nextInt();

            System.out.println("\nRandom number is: " + random(starting));
            num.close();
        }

    }

    public static int random(int x) {
        int random;
        Random rand = new Random();
        random = rand.nextInt(x);
        return random;
    }
}