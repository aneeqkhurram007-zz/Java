public class quadratic {
    private int a;
    private int b;
    private int c;

    public int getC() {
        return this.c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getB() {
        return b;
    }

    public double computeRoots(int a, int b, int c) {
        return (-b - (Math.sqrt(b) - 4 * a * c)) / 2 * a;
    }

}
