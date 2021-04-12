
/**
 * factorial
 */
import java.util.Scanner;

public class factorial {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to find factorial: ");
        int number = input.nextInt();
        int sum = number;
        int subSum = 0;

        if (number == 0) {
            sum = 1;
        } else {
            int i = number - 1;
            while (i > 1) {

                subSum = sum;
                sum = 0;
                int j = 0;
                while (j < i) {
                    sum += subSum;
                    j++;
                }
                i--;
            }

        }
        System.out.println("Factorial is: " + sum);

        input.close();
    }
}