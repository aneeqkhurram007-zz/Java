import java.util.*;

public class QuadraticMain {
    public static void main(String[] args) throws Exception {
        double a, b, c;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter value for A: ");
        a = input.nextDouble();
        System.out.println("Enter value for B: ");
        b = input.nextDouble();
        System.out.println("Enter value for C: ");
        c = input.nextDouble();
        System.out.println("A = " + a + " B = " + b + " C = " + c);
        QuadraticRoots qRoots = new QuadraticRoots(a, b, c);

        qRoots.display();
        input.close();
    }
}
