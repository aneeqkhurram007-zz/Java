
import java.util.*;

public class QuadraticMain {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        double a, b, c;
        System.out
                .println((a = input.nextDouble()) + "X2 " + (b = input.nextDouble()) + "X " + (c = input.nextDouble()));
        System.out.println("A = " + a + " B = " + b + " C = " + c);
        QuadraticRoots qRoots = new QuadraticRoots();
        qRoots.A = a;
        qRoots.B = b;
        qRoots.C = c;
        qRoots.display();
        input.close();
    }
}
