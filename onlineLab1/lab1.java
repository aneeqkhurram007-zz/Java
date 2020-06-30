
/**
 * lab1
 */

import java.util.*;

public class lab1 {
    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);
        System.out.println("\nEnter any number: ");

        int number = num.nextInt();
        int i = 1, sum1 = 0, sum2 = 0;

        while (i <= number) {
            sum1 = sum1 + i;
            i++;
        }
        System.out.println("\nSum without formula : " + sum1);
        sum2 = (number * (number + 1)) / 2;
        System.out.println("\nSum with formula : " + sum2);
        if (sum1 == sum2) {
            System.out.println("\nBoth are same");
        } else {
            System.out.println("\nBoth are different");
        }

        // num.close();
    }
}