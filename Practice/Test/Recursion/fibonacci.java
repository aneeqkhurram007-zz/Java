public class fibonacci {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.print(fibonnaci(i) + " ");

        }
    }

    static int fibonnaci(int n) {

        if (n == 1 || n == 0) {

            return n;
        }

        else {

            return fibonnaci(n - 1) + fibonnaci(n - 2);
        }

    }
}
