package task1;

import java.util.*;

public class inflation {
    public static void main(String[] args) {
        double cost, inflationRate;
        int numOfYears;
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter the current cost of Pencil: ");
        cost = input.nextDouble();
        System.out.print("\nEnter the number of years from now: ");
        numOfYears = input.nextInt();
        System.out.print("\nEnter the inflation rate: ");
        inflationRate = input.nextDouble();
        for (int i = 0; i < numOfYears; i++) {
            cost = cost + cost * (inflationRate / 100);
        }
        System.out.printf("\nThe cost of pencil after %d years will be = %.2f approx.\n", numOfYears, cost);
        input.close();

    }
}
