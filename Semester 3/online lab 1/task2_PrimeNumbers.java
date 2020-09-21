import java.util.*;

// import org.graalvm.compiler.core.common.util.IntList;

public class task2_PrimeNumbers {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int x/* c = 0 */;
        boolean check;
        // int[] arr = new int[50];
        System.out.println("\tPrime Numbers\n\n");
        System.out.println("Enter the upper limit for Prime Numbers: ");
        x = num.nextInt();

        System.out.println("Prime numbers are : ");
        for (int i = 0; i <= x; i++) {
            check = false;
            for (int k = 2; k < i; k++) {

                if (i % k == 0) {
                    check = true;
                    break;
                }

            }
            if (check == false) {
                // arr[c] = i;
                System.out.println(i);
                // c++;
            }
        }
        /*
         * for (int i = 0; i < c; i++) { System.out.println("\t" + arr[i]); }
         */
        num.close();
    }
}
