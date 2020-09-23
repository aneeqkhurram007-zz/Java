
//package Semester 3.online lab 1;
import java.util.*;

public class task1_NumbersTable {
    public static void main(String[] args) {
        // task2_PrimeNumbers n = new task2_PrimeNumbers();
        Scanner num = new Scanner(System.in);
        int x;
        char choice;
        System.out.println("\tTables");
        do {
            System.out.println("Enter a number: ");
            x = num.nextInt();
            for (int i = 1; i <= 10; i++) {
                System.out.println(x + " " + "X" + " " + i + " " + "=" + " " + x * i);
            }
            System.out.println("Do you want to continue (y/n): ");
            choice = num.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        num.close();

    }
}
