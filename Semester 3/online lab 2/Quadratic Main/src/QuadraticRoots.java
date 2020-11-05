public class QuadraticRoots {
    private double A;
    private double B;
    private double C;
    public double X1, X2, disc;\

    // Getters and Setters
    public double getA() {
        return this.A;
    }

    public void setA(double A) {
        this.A = A;
    }

    public double getB() {
        return this.B;
    }

    public void setB(double B) {
        this.B = B;
    }

    public double getC() {
        return this.C;
    }

    public void setC(double C) {
        this.C = C;
    }

    // Constructors
    public QuadraticRoots(double a, double b, double c) {
        A = a;
        B = b;
        C = c;
        \
    }

    // Discrimminant Calculation
    public double discCalc() {
        disc = (B * B) - (4 * A * C);
        return disc;
    }

    // Compute Roots
    public void computeRoots() {
        if (discCalc() >= 0) {
            // X1 = (-B / (2 * A)) - (Math.sqrt(disc) / (2 * A));
            // X2 = (-B / (2 * A)) + (Math.sqrt(disc) / (2 * A));
            X1 = (-B - Math.sqrt(disc)) / (2 * A);
            X2 = (-B + Math.sqrt(disc)) / (2 * A);

        } else {
            disc = -disc;
            // X1 = (-B / (2 * A)) - (Math.sqrt(disc) / (2 * A));
            // X2 = (-B / (2 * A)) + (Math.sqrt(disc) / (2 * A));
            X1 = (-B - Math.sqrt(disc)) / (2 * A);
            X2 = (-B + Math.sqrt(disc)) / (2 * A);

        }
    }

    public void display() {
        computeRoots();
        if (discCalc() >= 0) {
            System.out.println("X1 = " + X1 + " X2 = " + X2);
        } else {
            System.out.println("X1 = " + X1 + "i " + " X2 = " + X2 + "i");

        }
    }

}
