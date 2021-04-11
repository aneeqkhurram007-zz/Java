
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
            for (int i = number - 1; i > 1; i--) {

                subSum = sum;
                sum = 0;
                for (int j = 0; j < i; j++) {
                    sum += subSum;
                }

            }

        }
        System.out.println("Factorial is: " + sum);

        input.close();
    }
}