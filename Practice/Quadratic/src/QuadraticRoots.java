public class QuadraticRoots {

    double A;
    double B;
    double C;
    double positiveSolution;
    double negativeSolution;
    double discriminant;

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

    public void computeRoots() {
        discriminant = (B * B) - (4 * A * C);
        if (discriminant >= 0) {
            positiveSolution = (-B + (Math.sqrt(discriminant))) / (2 * A);
            negativeSolution = (-B - (Math.sqrt(discriminant))) / (2 * A);
        } else {
            discriminant = -discriminant;
            positiveSolution = (-B + (Math.sqrt(discriminant))) / (2 * A);
            negativeSolution = (-B - (Math.sqrt(discriminant))) / (2 * A);
            discriminant = -discriminant;
        }
    }

    public void display() {
        computeRoots();
        if (discriminant >= 0) {
            System.out.println("1st Root = " + positiveSolution + " 2nd Root = " + negativeSolution);
        } else {
            System.out.println("1st Root = " + positiveSolution + "i " + " 2nd Root = " + negativeSolution + "i ");

        }
    }

}
