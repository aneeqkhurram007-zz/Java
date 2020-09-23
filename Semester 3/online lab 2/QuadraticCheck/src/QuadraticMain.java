import java.util.*;

public class QuadraticMain {
    public static void main(String[] args) throws Exception {
        // QuadraticRoots quadraticRoots = new QuadraticRoots();
        Scanner num = new Scanner(System.in);
        double a, b, c;
        System.out.println("Enter value for A: ");
        a = num.nextDouble();
        System.out.println("Enter value for B: ");
        b = num.nextDouble();
        System.out.println("Enter value for C: ");
        c = num.nextDouble();
        QuadraticRoots quadraticRoots = new QuadraticRoots(a, b, c);

        quadraticRoots.display();
        num.close();

    }

}
